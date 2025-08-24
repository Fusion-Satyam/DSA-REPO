package dsa_divide&conquer;

public class MergeSort {

    public static void mergeSort(int arr[],int si , int ei){
        int mid = si+(si - ei) / 2; // Calculate the middle index
        mergeSort(arr, si, mid); // Sort the left half
        mergeSort(arr, mid + 1, ei); // Sort the right half

        merge(arr, si, mid, ei); // Merge the sorted halves
    }

    public stat
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10}; // Example input
        System.out.println("Original array:");
        printArray(arr);
        
        mergeSort(arr, 0, arr.length - 1);
        
        System.out.println("Sorted array:");
        printArray(arr);
    }
    
}
