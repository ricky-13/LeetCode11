package JustCode.AlgoPrac;

public class LongestBalancedString {

    public static void main(String[] args) {
        String s = "(()";
        char []arr = s.toCharArray();
        int count = 0;
        int tmpMax = 0;
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == '('){
                count = count + 1;
                tmpMax = tmpMax + 1;
            }
            else{
                count = count - 1;
                if (count == 0){
                    tmpMax = 0;
                }
            }
            if (tmpMax > max){
                max = tmpMax;
            }
        }

        System.out.println(max*2);
    }
}
