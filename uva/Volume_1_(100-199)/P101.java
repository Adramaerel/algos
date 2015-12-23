

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


// TODO Refactorer
public class P101 {

	static class Command {
		String verb;
		String id1;
		String proposition;
		String id2;
		@Override
		public String toString() {
			return verb + " " + id1 + " " + proposition + " " + id2;
		}
	}

	static List<Stack<String>> blocks = new ArrayList<Stack<String>>();

	static List<Command> commandsList = new ArrayList<P101.Command>();

	static int positionId1, positionId2;

	public static void main (String... args) throws Exception {

		lireCommandes();

		executerCommandes();


		afficherResultat();

	}

	private static void afficherResultat() {
		for(int i = 0; i < blocks.size(); i++) {
			System.out.print( i + ":");
			for(int j = 0; j < blocks.get(i).size(); j++) {
				System.out.print(" " + blocks.get(i).get(j));
			}
			System.out.println();
		}

	}

	private static void calculatePositions(String id1, String id2) {
		for(int i = 0 ; i < blocks.size(); i ++) {
			if(blocks.get(i).contains(id1))
				positionId1 = i;
			if(blocks.get(i).contains(id2))
				positionId2 = i;
		}

	}


	private static void replaceOnInitialState(String id1, Integer position) {
		Stack<String> stack = blocks.get(position);

		do {
			String s = stack.peek();
			if(s.equals(id1)) {
				break;
			} else {
				s = stack.pop();
				Integer futurePosition = Integer.parseInt(s);
				blocks.get(futurePosition).push("" + futurePosition);
			}
		} while(true);

	}

	private static void executerCommandes() {
		for(Command command : commandsList) {
			if(isValid(command)) {
				calculatePositions(command.id1, command.id2);
				//				System.out.println("position de " + command.id1 + " est " + positionId1);

				/*
				 * where a and b are block numbers, puts block a onto block b after returning any blocks 
				 * that are stacked on top of blocks a and b to their initial positions. 
				 */
				if(command.verb.equals("move") && command.proposition.equals("onto")) {

					replaceOnInitialState(command.id1, positionId1);
					replaceOnInitialState(command.id2, positionId2);
					String s = blocks.get(positionId1).pop();
					blocks.get(positionId2).push(s);
				}

				/*
				 * where a and b are block numbers, puts block a onto the top of the stack containing 
				 * block b, after returning any blocks that are stacked on top of block a to their initial positions. 
				 */
				if(command.verb.equals("move") && command.proposition.equals("over")) {
					replaceOnInitialState(command.id1, positionId1);
					String s = blocks.get(positionId1).pop();
					blocks.get(positionId2).push(s);
				}

				/*
				 * where a and b are block numbers, moves the pile of blocks consisting of block a, and any blocks 
				 * that are stacked above block a, onto block b. All blocks on top of block b are moved to their initial 
				 * positions prior to the pile taking place. The blocks stacked above block a retain their order when moved. 
				 */
				if(command.verb.equals("pile") && command.proposition.equals("onto")) {
					replaceOnInitialState(command.id2, positionId2);
					Stack<String> stackAboveA = new Stack<String>();
					do {
						String s = blocks.get(positionId1).pop();
						stackAboveA.push(s);
						if(s.equals(command.id1)) {
							break;
						}
					}while (true);
					while(!stackAboveA.isEmpty()) {
						blocks.get(positionId2).push(stackAboveA.pop());
					}
				}




				/*
				 * where a and b are block numbers, puts the pile of blocks consisting of block a, and any blocks 
				 * that are stacked above block a, onto the top of the stack containing block b. The blocks stacked 
				 * above block a retain their original order when moved. 
				 */
				if(command.verb.equals("pile") && command.proposition.equals("over")) {
					Stack<String> stackAboveA = new Stack<String>();
					do {
						String s = blocks.get(positionId1).pop();
						stackAboveA.push(s);
						if(s.equals(command.id1)) {
							break;
						}
					}while (true);
					while(!stackAboveA.isEmpty()) {
						blocks.get(positionId2).push(stackAboveA.pop());
					}
				}
			}
		}
	}



	private static void lireCommandes() throws NumberFormatException, IOException  {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		Integer nbBLocks = Integer.parseInt(input.readLine());
		initBLocksList(nbBLocks);
		String line;
		while(!(line = input.readLine()).equals("quit"))
		{
			String [] tab = line.split(" ");
			P101.Command command = new Command();
			command.verb = tab[0];
			command.id1 = tab[1];
			command.proposition = tab[2];
			command.id2 = tab[3];
			commandsList.add(command);
		}

	}

	private static boolean isValid(Command command) {
		if(command.id1.equals(command.id2)) {
			return false;
		}
		for(Stack<String> ligne : blocks) {
			if(ligne.contains(command.id1) && ligne.contains(command.id2)) {
				return false;
			}
		}
		return true;
	}

	private static void initBLocksList(Integer nbBLocks) {

		for(int i = 0; i < nbBLocks; i++) {
			Stack<String> stack = new Stack<String>();
			stack.push("" + i);
			blocks.add(stack);
		}

	}

}

