package DSA_PROBLEMS;

public class MaxProduct {
       public static int maxProduct(int[] arr) {
        // code here
        int max = Integer.MIN_VALUE;
        int prefix = 1 , suffix = 1;
        int n = arr.length;
        
        for(int i =0 ; i<n;i++){
            
            if(prefix == 0) {
                prefix =1;
            }
            if(suffix == 0){
                suffix =1;
            }
            
            prefix = prefix*arr[i];
            suffix = suffix*arr[n-i-1];
            
            max = Math.max(max , Math.max(prefix,suffix));
            
            
        }
        
        return max;
        
       
    }
    public static void main(String[] args) {
       int arr[] = {-2, 6, -3, -10, 0, 2};
         System.out.println(maxProduct(arr));
    }
    
}
