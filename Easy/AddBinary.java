package JustCode.Easy;

public class AddBinary {
    public static String addBinary(String a, String b) {
        int max = 0;
        String s = "";
//        int max = (a.length() > b.length()) ? a.length() : b.length();
        if(a.length() > b.length()){
            max = a.length();
            for(int i = 1; i <= a.length() - b.length(); i++){
                s = s + "0";
            }
            b = s + b;
        }
        else{
            max = b.length();
            for(int i = 1; i <= b.length() - a.length(); i++){
                s = s + "0";
            }
            a = s + a;
        }

        char[] arr = new char[max];
        char carry = '0';

        for(int i = max-1; i >= 0; i--){
            if(a.charAt(i) == b.charAt(i)){
                if(a.charAt(i) == '0' && carry == '0'){
                    arr[i] = '0';
                }
                else if(a.charAt(i) == '0' && carry == '1'){
                    arr[i] = '1';
                    carry = '0';
                }
                else if(a.charAt(i) == '1' && carry == '1'){
                    arr[i] = '1';
                    carry = '1';
                }
                else{
                    arr[i] = '0';
                    carry = '1';
                }
            }

            else{
                if(carry == '1'){
                    arr[i] = '0';
                    //carry stays 1, dont change
                }
                else{
                    arr[i] = '1';
                }
            }
        }

        if(carry == '1'){
//            arr[0] = '1';
            String x = "1" + String.valueOf(arr);
            return x;
        }

        String x = String.valueOf(arr);
        return x;
    }

    public static void main(String[] args) {
        String a = "1110";
        String b = "11";

        String ans = addBinary(a,b);

        System.out.println(ans);

        for(int i = 0; i < ans.length(); i++){
            System.out.println(ans.charAt(i));
        }

//        char[] arr = new char[]{'1','1','0','1'};
//        String s = String.valueOf(arr);
//        System.out.println(s);
//        String s = "";
//        for(int i = 1; i <= 2; i++){
//            s = s + "0";
//        }
//        System.out.println(s);

    }
}
