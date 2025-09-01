import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args){
        System.out.println("Enter the length of array: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
    
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        // Define Max 
        int max = arr[0];
        for(int j = 0; j<arr.length;j++){
            if (arr[j]>max) {
                max = arr[j];
            }
        }

        System.out.println("Maximum value is : "+max);
        scan.close();
    }
}
