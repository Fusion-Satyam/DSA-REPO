package dsa_strings;

public class RotatedString {
     
    public boolean isRotated(String s1, String s2) {
        // Step 1: If lengths don't match, cannot be rotations
        if (s1.length() != s2.length()) return false;

        // Step 2: Concatenate s1 with itself
        String concatenated = s1 + s1;

        // Step 3: Check if s2 is a substring of concatenated
        return concatenated.contains(s2);
    }
    public static void main(String[] args) {
        RotatedString rs = new RotatedString();
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        System.out.println(rs.isRotated(s1, s2)); // Output: true
    }
}

    

