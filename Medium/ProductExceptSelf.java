package JustCode.Medium;

public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] solArray = new int[nums.length];

        int product = 1;
        for(int i = 0; i < nums.length ; i++){
            solArray[i] = product;
            product = product*nums[i];
        }

        int reverseProduct = 1;
        for(int i = nums.length -1; i >= 0; i--){
            solArray[i]= solArray[i]*reverseProduct;
            reverseProduct=reverseProduct*nums[i];
        }
        return solArray;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,4,5};
        int []solArr = productExceptSelf(arr);

        for(int i = 0; i < solArr.length; i++){
            System.out.println(solArr[i]);
        }
    }
}
