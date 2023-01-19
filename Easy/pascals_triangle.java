package JustCode.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class pascals_triangle {
   public static List<List<Integer>> generate(int numRows) {
       List<List<Integer>> solList = new ArrayList<>();

       if(numRows == 1){
           solList.add(Arrays.asList(1));
           return solList;
       }

       if(numRows == 2){
           solList.add(Arrays.asList(1));
           solList.add(Arrays.asList(1,1));
           return solList;
       }

       solList.add(Arrays.asList(1));
       solList.add(Arrays.asList(1,1));

       for(int i = 2; i < numRows; i++){

           List<Integer> innerList = new ArrayList<Integer>();
           innerList.add(1);

           for(int j=0; j < i-1; j++){
               int x = solList.get(i-1).get(j) + solList.get(i-1).get(j+1);
               innerList.add(x);
           }

           innerList.add(1);
           solList.add(innerList);
       }
       return solList;
   }

    public static void main(String[] args) {
        int numRows = 5;
        List ans = new ArrayList();
        ans = generate(3);
        System.out.println(ans);
    }
    
}
