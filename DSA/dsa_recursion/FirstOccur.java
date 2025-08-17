package dsa_recursion;

public class FirstOccur {

    public static int firstOccur(int arr[],int i,int k){
        if(i == arr.length-1){
            return -1;
        
        }
        if  (arr[i]==k){
            return i;
        }
        return firstOccur(arr, i+1, k); // Recursive case: check the next element
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 3}; // Example input
        int k = 3; // Element to find
        int result = firstOccur(arr, 0, k);
        if (result != -1) {
            System.out.println("First occurrence of " + k + " is at index: " + result);
        } else {
            System.out.println(k + " not found in the array.");
        }
        
    }
    
}
