import java.util.Scanner;

public class CaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        String input = scanner.nextLine();
        scanner.close();

        
        if (input.length() == 1) {
            System.out.println(input);
            return;
        }

        
        String[] exceptions = {"a", "an", "the", "and", "or", "but", "for", "nor", "on", "at", "to", "by", "with", "in", "of"};

       
        String[] words = input.split(" ");

      
        StringBuilder titleCase = new StringBuilder();

        
        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            
            if (isException(word, exceptions) && i != 0) {
                titleCase.append(word);
            } else {
               
                titleCase.append(Character.toUpperCase(word.charAt(0)))
                         .append(word.substring(1));
            }

            
            if (i < words.length - 1) {
                titleCase.append(" ");
            }
        }

        System.out.println(titleCase.toString());
    }

    
    private static boolean isException(String word, String[] exceptions) {
        for (String exception : exceptions) {
            if (word.equals(exception)) {
                return true;
            }
        }
        return false;
    }
}
