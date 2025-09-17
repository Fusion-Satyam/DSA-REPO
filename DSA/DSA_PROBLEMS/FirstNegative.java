package DSA_PROBLEMS;
import java.util.*;

public class FirstNegative {
    static List<Integer> firstNegInt(int arr[], int k) {
        ArrayList<Integer> res = new ArrayList<>();
        Deque<Integer> q = new LinkedList<>();

        int i = 0, j = 0;

        while (j < arr.length) {
            // If current element is negative, add to queue
            if (arr[j] < 0) {
                q.addLast(arr[j]);
            }

            // Check window size
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                // Window size is k
                if (q.isEmpty()) {
                    res.add(0); // no negative in window
                } else {
                    res.add(q.peekFirst()); // first negative
                }

                // Remove outgoing element
                if (!q.isEmpty() && arr[i] == q.peekFirst()) {
                    q.pollFirst();
                }

                i++;
                j++;
            }
        }

        return res;
    }
    public static void main(String[] args) {
        int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        List<Integer> result = firstNegInt(arr, k);
        System.out.println("First negative integers in each window of size " + k + ": " + result);
    }
}
