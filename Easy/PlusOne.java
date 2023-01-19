package JustCode.Easy;

public class PlusOne {

    public int[] plusOne(int[] digits) {

        for(int i = digits.length -1; i >=0 ; i-- ){
            if ( digits[i] < 9 ){
                digits[i]++;
                return digits;
            }
                digits[i] = 0;
        }

        int[] newArr = new int[digits.length + 1];
        newArr[0] = 1;

        return newArr;
    }
    public static void main(String[] args) {
        int[] a = {7,9,1};

        PlusOne p = new PlusOne();

        int[] arr = p.plusOne(a);
        for (int i = 0 ; i < arr.length ; i++ ) {
            System.out.println(arr[i]);
        }

    }
}
