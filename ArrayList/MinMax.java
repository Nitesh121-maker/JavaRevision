package ArrayList;

import java.util.ArrayList;

import java.util.Collections;

public class MinMax {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(30);
        numbers.add(50);
        numbers.add(60);
        numbers.add(40);

        System.out.println("Numbers:"+numbers);

        int max = Collections.max(numbers);
        int min = Collections.min(numbers);

        System.out.println("Max numbe in the list is"+max);
        System.out.println("Min numbe in the list is"+min);
    }
}
