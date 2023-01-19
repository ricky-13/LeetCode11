package JustCode.Easy;

import java.util.HashMap;

public class Leetcode_2190 {
    public static int mostFrequent(int[] nums, int key) {
        int max = 0;
        int target = 0;

        HashMap<Integer,Integer> h = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length -1; i++){
            if(nums[i] == key){
                if(h.containsKey(nums[i+1])){
                    int x = h.get(nums[i+1]);
                    h.put(nums[i+1], ++x);
                }
                else{
                    h.put(nums[i+1], 1);
                }

                if(h.get(nums[i+1]) > max){
                    max = h.get(nums[i+1]);
                    target = nums[i+1];
                }
            }
        }
        return target;
    }

    public static void main(String[] args) {
        int arr[] = {2,2,2,2,3};
//        int arr[] = {1,1};
        int sol = mostFrequent(arr, 2);
        System.out.println(sol);
    }
}
