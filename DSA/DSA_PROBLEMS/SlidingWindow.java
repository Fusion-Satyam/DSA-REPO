package DSA_PROBLEMS;

import java.util.*;


public class SlidingWindow {
     public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            // Remove elements from front if they are out of the current window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove smaller elements from the back of the deque
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pollLast();
            }

            // Add current element at the back of the deque
            dq.offerLast(i);

            // First element is the largest in window
            if (i >= k - 1) {
                result.add(arr[dq.peekFirst()]);
            }
        }

        return result;
    }
    public static void main(String[] args) {
        SlidingWindow sol = new SlidingWindow();
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        ArrayList<Integer> maxValues = sol.maxOfSubarrays(arr, k);
        System.out.println(maxValues); // Output: [3, 3, 5, 5, 6, 7]
    }
}

