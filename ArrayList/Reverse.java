package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(40);
        numbers.add(50);
        numbers.add(90);
        numbers.add(70);

        System.out.println("Number"+numbers);
        Collections.reverse(numbers);
        System.out.println("Reversed Number"+numbers);
    }
}
