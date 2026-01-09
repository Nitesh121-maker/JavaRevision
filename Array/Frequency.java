package Array;

import java.util.Scanner;

public class Frequency {

    // Frequency of each element
    public static void FrequecyOfEachElement(int[] array){
        boolean[] visited = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            if (visited[i]) continue;

            int frequency = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    frequency++;
                    visited[j] = true;
                }
            }
            System.out.println("Frequency of element " + array[i] + " = " + frequency);
        }
    }

    // Main method 
    public static void main(String[] main){
        System.out.println("Enter the length:");
        Scanner objScanner = new Scanner(System.in);
        int n = objScanner.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the Array Element:");
        for (int i = 0; i < n; i++) {
            arr[i] = objScanner.nextInt();
        }

        int frequency = 0;

        System.out.println("Enter the Element to know frequesny of it:");
        int element  = objScanner.nextInt();
        
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == element) {
                frequency++;
            }
        }

        System.out.println("Frequency of the element is:"+frequency);
        
        FrequecyOfEachElement(arr);
    }
    
}

// Output
// Enter the length:
// 6
// Enter the Array Element:
// 1
// 22
// 22
// 3
// 3
// 3
// Enter the Element to know frequesny of it:
// 22
// Frequency of the element is:2
// Frequency of element 1 = 1
// Frequency of element 22 = 2
// Frequency of element 3 = 3