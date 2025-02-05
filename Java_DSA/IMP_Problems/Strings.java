import java.util.Scanner;
// import java.util.regex.Matcher;
// import java.util.regex.Pattern;

public class Strings {
    static void split(String inputString) {
        String regex = "(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)";

        // Use Pattern and Matcher to split the string based on the regular expression
       // Pattern pattern = Pattern.compile(regex);
       // Matcher matcher = pattern.matcher(inputString);

        // Split the string
        String[] parts = inputString.split(regex);

        // Display the parts
        for (String part : parts) {
            System.out.println(part);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your choice from 1 to 4");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("enter your string :");
                String y = sc.next();
                System.out.println("Upper Case   :" + y.toUpperCase());
                System.out.println("Upper Case : " + y.toLowerCase());
                break;
            case 2:
                String z = sc.next();
                System.out.println("enter yout character to check occurence:");
                char s = sc.next().charAt(0);
                int c = 0;
                for (int i = 0; i < z.length(); i++) {
                    if (z.charAt(i) == s) {
                        c++;
                    }
                }
                System.out.println("the occurences of " + s + " is :" + c);
                break;
            case 3:

                System.out.print("Enter a string: ");
                String m = sc.next();
                int con = 0;
                for (int i = 0; i < m.length(); i++) {
                    char currentChar = Character.toLowerCase(m.charAt(i));
                    if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o'
                            || currentChar == 'u') {
                        con++;
                    }
                }
                System.out.println("Occurrences of vowels: " + con);
                break;
            case 4:
                System.out.println("enter your string to split:");
                String a = sc.next();
                split(a);

                break;
        }sc.close();
    }
}
