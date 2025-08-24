import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        System.out.println("Enter the array length: \n");
        Scanner scanObj = new Scanner(System.in);

        int n = scanObj.nextInt();

        int i;
        int[] arr = new int[n];
        
        for (i = 0; i < n; i++) {
            arr[i] = scanObj.nextInt();
        }

        // reverse the array
        int start = 0;
        int end   = n-1;

        while (start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]   = temp;

            start++;
            end--;
        }
        System.out.println("Reversed array:");
        // Print the reverse
        for (i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

        scanObj.close();
    }
}
