package JustCode.AlgoPrac;

public class SameElementAsIndex {
    public static int findI(int[] arr, int l, int r){
        if (l==r && arr[l] == l){
            return l;
        }

        int m = (l + r)/2;
        int sol;
        if ( arr[m] < m){
            sol = findI(arr, m+1, r);
        }
        else{
            sol = findI(arr, l, m);
        }

        return sol;
    }

    public static void main(String[] args) {
        int []arr = {-3,-2,1,2,4,10};

        int ans = findI(arr, 0, arr.length -1 );
        System.out.println(ans);
    }
}
