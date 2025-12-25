/*
Find the Maximum and Minimum Element

Write a program to find the largest and smallest elements in an integer array.
Example:
*/
package Array;

import java.util.Arrays;
import java.util.Scanner;
public class MaxMin {
    // Min Max using the Simple Linear Scan
    public void MinMax(int[] arr){
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Max value:"+max +" Min value:"+min);
    }

    // Min Max using Sorting
    public static void SortingMinMax(int[] arr){
        // Sort array 
        Arrays.sort(arr);

        int min = arr[0];
        int max = arr[arr.length-1];
        System.out.println("\nMin Max value using Sorting:"+max +" Min value:"+min);
    }

    // Min and Max using java stream 
    public static void StreamMinMax(int[] arr){
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("\nMin Max value using Stream:"+max +" Min value:"+min);
    }
    public static void main(String[] args){
        System.out.println("Enter the length of array:");

        Scanner scanObj = new Scanner(System.in);
        
        System.out.println("Enter the length of the array: ");
        int n = scanObj.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanObj.nextInt();
        }
        
        MaxMin objMaxMIn = new MaxMin();
        objMaxMIn.MinMax(arr);
        MaxMin.SortingMinMax(arr);
        MaxMin.StreamMinMax(arr);
    }
}
