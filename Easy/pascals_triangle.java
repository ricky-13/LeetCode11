package JustCode.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class pascals_triangle {
   public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> solList = new ArrayList<List<Integer>>();
//       List l = [1];
       solList.add(Arrays.asList(1));
       solList.add(Arrays.asList(1,1));

       for(int i = 3; i <= numRows; i++){
           List<Integer> innerList = new ArrayList<Integer>();
           innerList.add(1);

           for(int j = 1; j <= i-2; j++){
               int x = solList.get(i-1).get(j) + solList.get(j+1).get(j+1);
           }


       }

       return null;
   }
    
}
