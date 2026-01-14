package Array;

import java.util.Scanner;

public class StringArray {
    public static void main(String[] args){
        System.out.println("Enter the length");
        Scanner objScanner = new Scanner(System.in);
        int n = objScanner.nextInt();

        objScanner.nextLine();
        String[] arr = new String[n];
        
        System.out.println("Take Strig Array: ");

        for (int i = 0; i < n; i++) {
            arr[i] = objScanner.nextLine();
        }
        
        System.out.println("Strig Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

// Output
// Enter the length
// 4
// Take Strig Array: 
// java
// python
// c
// Scala
// Strig Array:
// java
// python
// c
// Scala
