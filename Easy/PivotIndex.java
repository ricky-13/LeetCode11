package JustCode.Easy;

public class PivotIndex {

    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
        }
        int lSum = 0;
        int rSum = sum;

        for(int i = 0 ; i < nums.length ; i++){
            rSum = rSum - nums[i];

            if(lSum == rSum){
                return i;
            }

            lSum = lSum + nums[i];
        }

//        MY SOLUTION
//        for(int i = 0 ; i < nums.length ; i++){
//            int rightSum = 0;
//            int leftSum = 0;
//
//            for(int j = 0 ; j < i ; j++){
//                leftSum = leftSum + nums[j];
//            }
//            System.out.println("left - " + leftSum);
//
//            for(int k = nums.length - 1 ; k > i ; k--){
//                rightSum = rightSum + nums[k];
//            }
//            System.out.println("right - " + rightSum);
//
//            if(leftSum == rightSum){
//                return i;
//            }
//        }
        return -1;
    }

    public static void main(String[] args) {
	// write your code here
        PivotIndex m = new PivotIndex();

        int[] arr1 = {1,7,3,6,5,6};
        System.out.println(m.pivotIndex(arr1));

        int[] arr2 = {1,2,3};
        System.out.println(m.pivotIndex(arr2));

        int[] arr3 = {2,1,-1};
        System.out.println(m.pivotIndex(arr3));
    }
}
