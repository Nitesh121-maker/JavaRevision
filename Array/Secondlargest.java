package Array;

import java.util.Scanner;

public class Secondlargest {
    public static void main(String[] args){
        System.out.println("Enter the Length:");
        Scanner scanObj = new Scanner(System.in);
        int n = scanObj.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the element of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanObj.nextInt();
        }

        int largest = 0;
        int secondlargest = 0;

        // Finds the second largest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            }else if(arr[i]<secondlargest && arr[i]>largest){
                secondlargest = arr[i];
            }
        }

        System.out.println("Largest element is: "+largest+" and "+"2nd largest element of the array: "+secondlargest);
    }
}

// Output

// Enter the element of the array:
// 10
// 5
// 6
// 7
// 20
// Largest element is: 20 and 2nd largest element of the array: 10