import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){
        System.out.println("Enter the num to check: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if ((num%2) == 0) {
            System.out.println("Entered number is Even number:"+num);
        } else{
            System.out.println("Entered number is odd number:"+num);
        }

        scan.close();
    }
}
