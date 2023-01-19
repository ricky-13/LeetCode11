package JustCode.AlgoPrac;

public class LongestAlternating {
    public static int longestAlternating(int []arr){
        int []dp = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            int m = 0;
            for(int j=0; j<i; j++){
                if(arr[i] < arr[j] && dp[j]%2 == 0 ){
                    m = dp[j];
                }
                else if(arr[i] > arr[j] && dp[j]%2 != 0){
                    m = dp[j];
                }
            }
            dp[i] = 1 + m;
        }
        int max =0;
        for(int i=0; i<dp.length; i++){
            if ( dp[i] > max ){
                max = dp[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int []arr = {1, 2 ,4};

        int sol = longestAlternating(arr);
        System.out.println(sol);
    }
}
