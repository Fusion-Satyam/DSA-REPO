package dsa_recursion;

public class Fibo {


    public static int fibo(int n){
        if(n==0){
            return 0;

        }
        if (n==1){
            return 1; // Base case: Fibonacci of 0 is 0, and Fibonacci of 1 is 1
        }
        
        return (fibo(n-1) + fibo(n-2)); // Recursive case: Fibonacci of n is the sum of Fibonacci of (n-1) and (n-2)
    }

    public static void main(String[] args) {
        int n = 5; // Example input
        int result = fibo(n);
        System.out.println("Fibonacci of " + n + " is: " + result);
        
    }
    
}
