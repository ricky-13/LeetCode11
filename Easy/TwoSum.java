package JustCode.Easy;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] solArray = new int[2];
        HashMap<Integer, Integer> solMap = new HashMap();
//        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            if(solMap.containsKey(target - nums[i])){
                solArray[1] = i;
                solArray[0] = solMap.get(target - nums[i]);
                return solArray;
            }

            solMap.put(nums[i], i );
        }

        return solArray;
    }

    public static void main(String[] args) {
//        int[] arr = new int[]{}

        int[] arr = twoSum(new int[]{2,3,4}, 6);

        for(int i : arr){
            System.out.println(i);
        }

    }
}
