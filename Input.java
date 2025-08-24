import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("Enter the Name:");

        String UserName = Scanner.nextLine();

        System.out.println("Username:"+UserName);

        Scanner.close();
    }
}
