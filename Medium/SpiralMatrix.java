package JustCode.Medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> solList = new ArrayList<Integer>();
        int left = 0, right = matrix[0].length - 1, top = 0, bottom = matrix.length-1;

        while (left <= right && top <= bottom){
            for(int i = left; i <= right; i++){
                solList.add(matrix[top][i]);
            }
            top++;

            for(int i = top; i <= bottom; i++){
                solList.add(matrix[i][right]);
            }
            right--;

            if(top > bottom || left > right){
                break;
            }

            for(int i = right; i >= left; i--){
                solList.add(matrix[bottom][i]);
            }
            bottom--;

            for(int i = bottom; i >= top; i--){
                    solList.add(matrix[i][left]);
            }
            left++;
        }

//        String toString(){
//            System.out.println("yoolloo");
//        }

        return solList;
    }

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
//        l.add(1);
//        l.add(5);
//        l.add(6);
//        System.out.println(l.size());
//        int[][] a = new int[][]{{1, 2, 3}};

        int[][] a = new int[][]{{1, 2, 3}};


//        int[][] a = new int[][]{{1},{2},{3},{4}};

//        System.out.println(a[1].length);
//        int[] arr = new int[]{1,3,5,6,4};
//        String d = "left";
//        if (d == "right"){
//            System.out.println("works");
//        }
//        else{
//            System.out.println("doesnt");
//        }
//        SpiralMatrix s = new SpiralMatrix();
//        l = s.spiralOrder(a);
        l = spiralOrder(a);
        System.out.println(l);
    }
}
