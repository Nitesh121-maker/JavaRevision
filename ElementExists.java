import java.util.ArrayList;
import java.util.Scanner;

public class ElementExists {
    ArrayList<String> Exists(String productName){
        ArrayList<String> element = new ArrayList<>();
        element.add("Banana");
        element.add("Apple");
        element.add("Banana");
        
        if (element.contains(productName)) {
            System.out.println("This product "+productName+" is in the list: "+element);
        }else{
            System.out.println("This product "+productName+" is not in the list: "+element);
        }
        return element;
    }
}

// call the exists function

class CheckProduct{
    public static void main(String[] args){
        System.out.print("Enter the product name to check: ");
        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine();
        ElementExists check = new ElementExists();
        check.Exists(product);
        scan.close();
    }
}