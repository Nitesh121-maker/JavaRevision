import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        try (Scanner Scanner = new Scanner(System.in)) {
            System.out.println("Enter the length of the Array:\n");

            int n = Scanner.nextInt();

            int[] arr = new int[n];
            int i;
            for(i=0; i<n; i++){
               arr[i] = Scanner.nextInt();
            }

            // print the array
            System.out.println("Array Elements:");

            for (i = 0; i < arr.length; i++) {
                System.out.println(arr[i]+" ");
            }

            System.out.println();

            // find the largest 
            int max = arr[0];
            for (i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            // find sum of the array
            int sum = 0;
            for(i = 0; i<arr.length; i++){
                sum = sum+arr[i];
            }

            System.out.println("largest number: "+max);
            System.out.println("Sum of the Array: "+sum);

            Scanner.close();
        }
    }
}
