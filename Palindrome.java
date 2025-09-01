import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        System.out.print("Enter the Word to chheck: ");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        word = word.toLowerCase();

        // Reverese the string
        String rev = "";
        for (int i = word.length()-1; i >= 0 ; i--) {
            rev = rev+word.charAt(i);
        }
        boolean res = word.equals(rev);
        if (res) {
            System.out.println("The word "+word+" is palindrome");
        } else {
            System.out.println("The word "+word+" is not palindrome");
        }
    }
}
