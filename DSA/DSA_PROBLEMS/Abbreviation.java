import java.util.*;

public class Abbreviation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totWord = sc.nextInt();

        // Consume leftover newline
        sc.nextLine(); 

        List<String> result = new ArrayList<>();

        for (int i = 0; i < totWord; i++) {
            String word = sc.nextLine();

            if (word.length() > 10) {
                String abbreviated = word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1);
                result.add(abbreviated);
            } else {
                result.add(word);
            }
        }

        for (String res : result) {
            System.out.println(res);
        }

        sc.close();
    }
}
