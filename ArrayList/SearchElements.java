package ArrayList;

import java.util.ArrayList;

public class SearchElements {
    public static void main(String[] args){
        ArrayList<String> products = new ArrayList<>();
    
        products.add("Apple");
        products.add("Banana");
        products.add("Mango");
        products.add("Orange");
        
        String search = "Apple";

        if (products.contains(search)) {
            System.out.println(search + " is found in the list.");
        } else {
            System.out.println(search + " is found not in the list.");
        }
    }
}
