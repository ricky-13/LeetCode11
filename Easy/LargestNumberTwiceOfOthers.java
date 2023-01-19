package JustCode.Easy;

public class LargestNumberTwiceOfOthers {

    public int dominantIndex(int[] nums) {
        int largestInt = 0;
        int largestIntIndex = 0;
        if (nums.length == 1){
            return 0;
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > largestInt){
                largestInt = nums[i];
                largestIntIndex = i;
            }
        }

        for (int i : nums){
            if (largestInt < 2*i && largestInt != i){
                return -1;
            }
        }

        return largestIntIndex;
    }
    public static void main(String[] args) {
        LargestNumberTwiceOfOthers obj = new LargestNumberTwiceOfOthers();

        int[] arr1 = {3,1,0,6};
        System.out.println(obj.dominantIndex(arr1));

        int[] arr2 = {1,2,3,4};
        System.out.println(obj.dominantIndex(arr2));

        int[] arr3 = {4};
        System.out.println(obj.dominantIndex(arr3));
    }
}
