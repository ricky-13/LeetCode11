package JustCode.Medium;

public class IndexFirstOccurenceInString {
    public static int strStr(String haystack, String needle) {
        for(int i = 0; i < haystack.length(); i++){
            for(int j = 0; j < needle.length(); j++){
                if(haystack.charAt(i + needle.length() -1 ) == needle.charAt(needle.length() - 1)){
                    return (i - (needle.length() ));
                }

                if(haystack.charAt(i+j) != needle.charAt(j)){
                    break;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s1 = "adifsadsdf";
        String s2 = "sad";

        int ans = strStr(s1, s2);
        System.out.println(ans + "??");
    }
}
