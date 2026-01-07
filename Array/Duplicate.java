package Array;

import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args){
        System.out.println("Enter the Array Length: ");
        Scanner ScanObj = new Scanner(System.in);
        int n = ScanObj.nextInt();
        int i;
        int arr[] = new int[n];

        for ( i = 0; i < n; i++) {
            arr[i] = ScanObj.nextInt();
        }
        
        for ( i = 0; i < arr.length; i++) {
           for (int j = i+1; j < arr.length; j++) {
               if (arr[i] == arr[j]) {
                  System.out.println("\nDuplicate Element"+arr[i]);
                  break;
               }
           }
        }

     
    }
}

// Output:
// Enter the Array Length: 
// 5
// 1
// 2
// 3
// 1
// 2

// Duplicate Element1

// Duplicate Element2
