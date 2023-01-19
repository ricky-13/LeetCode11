package JustCode.AlgoPrac;

public class FindN {

    public int findN(int []arr){
        int p = 0;
        int q = arr.length - 1;

        while(q-p>1){
            int m = (p + q)/2;

            if (arr[m] == -1){
                q = m-1;
            }
            else{
                p = m;
            }
        }

        if(arr[q] == -1){
            return p;
        }
        else return q;

    }


    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,9,10,-1,-1};
        for(int i=0; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
        FindN obj = new FindN();
        int ans = obj.findN(arr);
        System.out.println(arr[ans]);
    }
}
