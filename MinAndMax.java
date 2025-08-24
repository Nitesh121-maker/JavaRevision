import java.util.Scanner;

public class MinAndMax {

    public static void main(String[] args){
        Scanner ScanObj = new Scanner(System.in);
        System.out.print("Enter the length of the array:");
        int n = ScanObj.nextInt();

        int[] arr = new int[n];

        int i;

        for (i = 0; i < arr.length; i++) {
            arr[i] = ScanObj.nextInt();
        }

        
    }
}