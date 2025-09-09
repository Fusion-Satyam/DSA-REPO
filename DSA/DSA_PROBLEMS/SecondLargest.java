package DSA_PROBLEMS;


public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 25, 30};

        if (arr.length < 2) {
            System.out.println("Array should have at least 2 elements.");
            return;
        }

        Integer first = null, second = null;

        for (int num : arr) {
            // Skip if duplicate
            if ((first != null && num == first) || (second != null && num == second)) {
                continue;
            }

            if (first == null || num > first) {
                second = first;
                first = num;
            } else if ((second == null || num > second) && num < first) {
                second = num;
            }
        }

        if (second != null) {
            System.out.println("Second Largest Element: " + second);
        } else {
            System.out.println("There are not enough distinct elements to find the second largest.");
        }
    }
}
