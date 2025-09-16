package DSA_PROBLEMS;

public class RemoveDuplicate {

    public static int removeDuplicates(int []arr){
        
        if(arr.length == 0){
            return 0;
        }

        int i = 0;
        for (int j = 0;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        
        int []arr = {1,1,2,2,3,4,4,5};
        int length = removeDuplicates(arr);
        System.out.println("Length of array after removing duplicates: " + length);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
