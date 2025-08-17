package dsa_recursion;

public class CheckSorted {
    public static boolean check(int arr[],int i){
        if (i == arr.length -1){
            return true;

        }
        if ( arr[i] > arr[i + 1]) {
            return false; // If the current element is greater than the next, the array is not sorted
        }
        return check(arr,i+1); // Recursive case: check the next element
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5}; // Example input
        boolean result = check(arr, 0);
        if (result) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
        
    }
}
