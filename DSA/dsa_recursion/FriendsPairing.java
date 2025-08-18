package dsa_recursion;

//Question: Friends Pairing Problem:-

//Given n friends, each one can remain single or can be paired up  with some other friend.
//Each friend can be paired only once. 
//Find out the total number of ways in which friends can remain single or can be paired up.


public class FriendsPairing {
    public static int friendsPairing(int n) {
        if (n == 2 || n == 1) {
            return n; // Base case: If there are 0, 1, or 2 friends, return n
        }

        int fnm1 = friendsPairing(n - 1); // Case 1: nth friend remains single
        int fnm2 = friendsPairing(n - 2); // Case 2: nth friend pairs with one of the (n-1) friends
        int pairWays = (n - 1) * fnm2; // Number of ways to pair nth friend with one of the (n-1) friends

        int totalWays = fnm1 + pairWays; // Total ways = single case + pairing case 
        return totalWays; // Return the total number of ways   

        //0r //return friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2);

        
    }

    public static void main(String[] args) {
        int n = 3; // Example input
        int result = friendsPairing(n);
        System.out.println("Total ways for " + n + " friends to remain single or pair up: " + result);
    }
    
}
