package ArrayList;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(40);
        numbers.add(70);
        numbers.add(90);
        numbers.add(70);

        System.out.println("Before Removing Duplicates: " + numbers);

        // Convert to set and back to list 

        LinkedHashSet<Integer> set = new LinkedHashSet<>(numbers);

        numbers = new ArrayList<>(set);

        System.out.println("After Removing Duplicates: " + numbers);
    }
}
