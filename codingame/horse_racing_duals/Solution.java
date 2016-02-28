import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int min = -1;
        for (int i = 0; i < N; i++) {
            pq.add(in.nextInt());
        }
        Integer [] tab = pq.toArray(new Integer[N]);
        for(int i = 1; i <  tab.length; i++) {
            int res = Math.abs(tab[i] - tab[i - 1]);
            if(res < min || min == -1) {
                min = res;
            }

        System.out.println(min);
    }
}
