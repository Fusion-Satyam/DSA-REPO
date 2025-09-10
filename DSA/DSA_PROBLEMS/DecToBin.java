


package DSA_PROBLEMS;

public class DecToBin {
    public static String decToBin(int num) {
        if (num == 0) return "0";

        StringBuilder binary = new StringBuilder();

        while (num > 0) {
            int rem = num % 2;
            binary.append(rem);
            num = num / 2;
        }

        return binary.reverse().toString(); // Reverse to get correct order
    }

    public static void main(String[] args) {
        int num = 10;
        System.out.println("Binary of " + num + " is: " + decToBin(num));  // Output: 1010
    }
}


/*public static void main(String[] args) {   ONE LINER METHOD
    int num = 10;
    System.out.println("Binary of " + num + " is: " + Integer.toBinaryString(num));
}*/
