#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define N 25

struct pile {
	int donnee;
	struct pile * suivant;
};

/* TODO A FINIR */

typedef struct pile* Pile;

void afficher_tableau_pile(Pile[]);

void replace_blocks_on_top(int);

Pile search_pile_by_id(int);

Pile search_head_pile_by_id(int);

Pile detach(int);

int main() {
	int n = 0; /* taille de la chaine de blocks */
	int i = 0;
	char verbe [5], proposition[5];
	int id1, id2;
	Pile tableau [N];
	Pile a, b, head_of_b_stack, head_of_a_stack;

	/* lecture de la taille de la chaîne de blocks */
	scanf("%d\n",&n);
	for(i = 0; i < N; i ++) {
		tableau[i] = malloc(sizeof(tableau[i]));
		tableau[i]->donnee = i;
		tableau[i]->suivant = NULL;
	}
	
	/* lecture des commandes */
		while(scanf("%s", verbe))
		{
			if(!strcmp(verbe, "quit"))
			{
				break;
			} else 
			{
				scanf("%d", &id1);
				scanf("%s", proposition);
				scanf("%d", &id2);
				printf("Commande entree %s %d %s %d\n", verbe, id1, proposition, id2);
				/* where a and b are block numbers, puts block a onto block b after 
				returning any blocks that are stacked on top of blocks a and b to their initial positions. */
				if(!(strcmp(verbe, "move") + strcmp("proposition", "onto")))
				{
					replace_blocks_on_top(id1);
					replace_blocks_on_top(id2);
					a = search_pile_by_id(id1);
					b = search_pile_by_id(id2);
					b->suivant = a;
				}
				/* where a and b are block numbers, puts block a onto the top of the stack containing block b, 
				after returning any blocks that are stacked on top of block a to their initial positions.  */
				if(!(strcmp(verbe, "move") + strcmp("proposition", "over")))
				{
					replace_blocks_on_top(id1);
					head_of_b_stack = search_head_pile_by_id(id2);
					head_of_b_stack->suivant = a;
				}
				/* where a and b are block numbers, moves the pile of blocks consisting of block a, and 
				any blocks that are stacked above block a, onto block b. All blocks on top of block b are 
				moved to their initial positions prior to the pile taking place. The blocks stacked above block 
				a retain their order when moved.  */
				if(!(strcmp(verbe, "pile") + strcmp("proposition", "onto")))
				{
					replace_blocks_on_top(id2);
					a = detach(id1);
					b = search_pile_by_id(id2);
					b->suivant = a;
					
				}
				/* where a and b are block numbers, puts the pile of blocks consisting of block a, and any 
				blocks that are stacked above block a, onto the top of the stack containing block b. The blocks 
				stacked above block a retain their original order when moved.  */
				if(!(strcmp(verbe, "pile") + strcmp("proposition", "over")))
				{
					
				}
			}
		}
		afficher_tableau_pile(tableau);

}

Pile detach(int id)
{
}

Pile search_head_pile_by_id(int id)
{
	return NULL;
}
	

Pile search_pile_by_id(int id) {
	return NULL;
}

void replace_blocks_on_top(int id)
{
	Pile p = search_pile_by_id(id);
	Pile pile_to_replace;
	Pile new_head;
	while(NULL != p->suivant)
	{
		pile_to_replace = p->suivant;
		new_head = search_head_pile_by_id(pile_to_replace->donnee);
		new_head->suivant = pile_to_replace;
		p = pile_to_replace;
	}
}


void afficher_tableau_pile(Pile pile[])
{
	int i;
	Pile courant;
	for(i = 0; i < N; i++) {
		printf("%d:", i);
		courant = pile[i];
		do {
			printf("%d ", courant->donnee);
		}
		while(courant-> suivant, courant = courant->suivant);
		printf("\n");
	}
}
