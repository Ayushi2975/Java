import java.util.*;

public class PG {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String lower = "abcdefghijklmnopqrstuvwxyz";
            String numbers = "0123456789";
            String symbols = "!@#$%^&*";

            System.out.print("Enter password length (min 6): ");
            int length = sc.nextInt();

            if (length < 6) {
                System.out.println("Password must be at least 6 characters!");
                return;
            }

            Random rand = new Random();
            StringBuilder password = new StringBuilder();

            // At least one of each type
            password.append(upper.charAt(rand.nextInt(upper.length())));
            password.append(lower.charAt(rand.nextInt(lower.length())));
            password.append(numbers.charAt(rand.nextInt(numbers.length())));
            password.append(symbols.charAt(rand.nextInt(symbols.length())));

            String allChars = upper + lower + numbers + symbols;

            // Remaining characters
            for (int i = 4; i < length; i++) {
                password.append(allChars.charAt(rand.nextInt(allChars.length())));
            }

            // Shuffle
            List<Character> list = new ArrayList<>();
            for (char c : password.toString().toCharArray()) {
                list.add(c);
            }

            Collections.shuffle(list);

            StringBuilder finalPassword = new StringBuilder();
            for (char c : list) {
                finalPassword.append(c);
            }

            System.out.println("Strong Password: " + finalPassword);
        }
    }
}