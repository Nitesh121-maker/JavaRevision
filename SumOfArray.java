import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args){
        System.out.print("Enter the length of the array:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int arr[]  = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        // Sum of the array
        int sum = 0;

        for (i = 0; i < arr.length; i++) {
            sum = sum+arr[i];
        }

        System.out.print("Sum of the Array: "+sum);
        scan.close();
    }
}
