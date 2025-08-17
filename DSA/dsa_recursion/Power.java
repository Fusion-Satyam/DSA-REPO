package dsa_recursion;

public class Power {

    public static int power(int x , int n){
        if(n==0){
            return 1;

        }
        if (n==1){
            return x;
        }

        return power(x,n-1)*x;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int result = power(x, n);
        System.out.println(x + " raised to the power of " + n + " is: " + result);
    }
    
}
