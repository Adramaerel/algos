import java.util.*;
import java.io.*;
import java.math.*;

class Player {
    
    public static int recherche_max(Integer [] tab) {
        int result = tab[0];
        int index = 0;
        for(int i = 1; i < 8; i++) {
            if(tab[i] > result) {
                result = tab[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        Integer [] tab = new Integer [8];
        int j = 0;
        int max = -1;
        // game loop
        while (true) {
            int spaceX = in.nextInt();
            int spaceY = in.nextInt();
            for (int i = 0; i < 8; i++) {
    
                tab[i] = in.nextInt();
            }
            
            max = recherche_max(tab);
            
            if(spaceX == max) {
                System.out.println("FIRE");
            } else {
                System.out.println("HOLD");
            }
            
        }
    }
}
