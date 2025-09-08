package DSA_PROBLEMS;

public class Missing_no {
    public static void main(String[] args) {
        int[]arr = {1,2,4,5};
        int n = arr.length;
        int total = (n+1)*(n+2)/2;
        int sum = 0;
        for(int i = 0 ; i<n;i++){
            sum += arr[i];

        }
        int missing = total - sum;
        System.out.println("Missing no is : "+missing);
        
    }
}
