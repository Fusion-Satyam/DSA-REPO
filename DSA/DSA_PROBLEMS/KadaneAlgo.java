package DSA_PROBLEMS;



public class KadaneAlgo {
     public static int maxSubarraySum(int[] arr) {
        // Code here
        int max = Integer.MIN_VALUE;
        int curSum = 0;
        
        for (int i = 0 ; i<arr.length;i++){
            curSum  += arr[i];
            if (curSum > max ){
                max = curSum;
            }
            if(curSum < 0){
                curSum = 0;
            }
            
            }
            
            return max;
        
    }

    public static void main(String[] args) {
     
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubarraySum(arr));
    }
}
