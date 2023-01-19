package JustCode.AlgoPrac;

public class MaximumSubarray {
        public static int maxSubArray(int[] nums) {
            int []DP = new int[nums.length];
            DP[0] = nums[0];
            int max = DP[0];

            for (int i = 1; i < nums.length; i++){
                if( DP[i-1] + nums[i] > nums[i]){
                    DP[i] = DP[i-1] + nums[i];
                }
                else{
                    DP[i] = nums[i];
                }
                if ( DP[i] > max){
                    max = DP[i];
                }
            }
            return max;
        }

    public static void main(String[] args) {
        int []arr = {1, -4, 6, 8, -10, -1, 20};

        int sol = maxSubArray(arr);
        System.out.println(sol);
    }
}
