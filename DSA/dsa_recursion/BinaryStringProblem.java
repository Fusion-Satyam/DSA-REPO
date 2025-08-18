package dsa_recursion;

//Question: Print all binary strings of length n without consecutive 1's

public class BinaryStringProblem {

    public static void printBinStrings(int n , int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

       printBinStrings(n - 1, 0, str+"0"); // Place '0' at the current position


        if (lastPlace == 0) {
            printBinStrings(n - 1, 1, str+"1"); // Place '1' at the current position only if last place was '0'
        }
    }
    public static void main(String[] args) {
        int n = 5; // Example input for length of binary strings
        printBinStrings(n, 0, ""); // Start with an empty string and last place as '0's
        
    }
}
