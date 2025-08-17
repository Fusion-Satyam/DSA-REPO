package dsa_recursion;

public class LastOccur {
    public static int lastOccur(int[]arr, int i, int k){
        if(i < 0){
            return -1;

        }
        if(arr[i]==k){
            return i;
        }
        return lastOccur(arr, i-1, k);


    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 3}; // Example input
        int k = 3; // Element to find
        int result = lastOccur(arr, arr.length - 1, k);
        if (result != -1) {
            System.out.println("Last occurrence of " + k + " is at index: " + result);
        } else {
            System.out.println(k + " not found in the array.");
        }
        
    }
    
}
