/*
Reverse an Array

Write a Java program to reverse the elements of an array in-place without using any additional array.
*/
package Array;
import java.util.Scanner;
public class Reverse {
    // Reverse array by just printing it from last index 
    public void reverse(int[] arr){
        int i;
        System.out.println("Array in original order:");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println("");
        System.out.println("Array in reverse order:");
        for (i = arr.length-1; i >= 0 ; i--) {
            System.out.print(arr[i]+",");
        }
    }

    // Reverse the array using swaping
    public static void reverseSwap(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println("\nReveresed array using swap logic");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    // Reverse using temprory array
    public int[] reverseWithTempArray(int[] arr){
        int [] reversed = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length-1-i];
        }

        return reversed;
    }
    // Reverse array using the recursive method
    public void recursiveReverse(int[] arr, int start, int end) {

        // Base condition
        if (start >= end) {
            return;
        }
    
        // Swap
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    
        // Recursive call with updated indices
        recursiveReverse(arr, start + 1, end - 1);
    }
    
    // Get Input 
    public static void main(String[] args){
        System.out.println("Enter the length of the Array: ");
        Scanner scanObj = new Scanner(System.in);

        int n = scanObj.nextInt();
        int i;
        int[] arr = new int[n];
        for (i = 0; i < arr.length; i++) {
            arr[i] = scanObj.nextInt();
        }
        // Create Object of the class 
        Reverse objReverse = new Reverse();
        
        // Pass the array in reverse method
        objReverse.reverse(arr);
        Reverse.reverseSwap(arr);
        int[] reversed = objReverse.reverseWithTempArray(arr);
        System.out.println("\nReversed array using the temp array:");
        for(i = 0;i<reversed.length;i++){
            System.out.print(reversed[i]+",");
        }

        // Recursive result 
        objReverse.recursiveReverse(reversed,0, arr.length - 1);
        System.out.println("\nReveresed array using recursive logic");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }
}


