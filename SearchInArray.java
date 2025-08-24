import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args){
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Length Of Array:");
        n = scan.nextInt();

        int i;
        int arr[] = new int[n];
        for (i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        
        int search;
        System.out.print("Enter the Search Value");
        search = scan.nextInt();

        boolean found = false;
        // search the  value in  array
        for (i = 0; i<n; i++) {
            if (arr[i] == search) {
                System.out.print("Search value "+search+" is present in the array");
                found = true;
                break;
            } 
        }
        if(!found) {
            System.out.print("Search value "+search+" is not present in the array");
        }
        scan.close();
    }
}
