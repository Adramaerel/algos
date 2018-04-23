import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P640 {

       public static Integer max = 1_000_000;

       public static void main (String [] args) {

             long a = Calendar.getInstance().getTimeInMillis();

             Set<Integer> set = new HashSet<>();

            

             for(int i = 1; i <= max; i++) {

                    set.add(i);

             }

            

             for(int j = 1; j < max; j++) {

                    int generatedNumber = d(j);

                    set.remove(generatedNumber);

             }

            

             List<Integer> list = new ArrayList<>();

            

             list.addAll(set);

            

             Collections.sort(list);

            

             for(Integer integer : list) {

                    System.out.println(integer);

             }

       }

 

       private static int d(int j) {

             int d = j;

             while(true) {

                    if( j < 10) {

                          d += j;

                          break;

                    }

                    d += j % 10;

                    j = j / 10;

             }

            

             return d;

       }

}
