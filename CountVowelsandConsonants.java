import java.util.Scanner;

public class CountVowelsandConsonants {
    public static void main(String[] args){
        System.out.print("Enter the sentence: ");
        Scanner scan = new Scanner(System.in);

        String sentence = scan.nextLine();

        sentence = sentence.toLowerCase();
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < sentence.length(); i++) {
           char ch = sentence.charAt(i);

           if (Character.isLetter(ch)) {
               if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                  vowelCount++;
               } else {
                  consonantCount++;
               }
           }
        }

        System.out.print("The number of consonant "+consonantCount+" The number of consonant "+vowelCount);
    }
}
