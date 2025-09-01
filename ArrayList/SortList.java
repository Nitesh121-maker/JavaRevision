package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortList {
    public static void main(String[] args){
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(85);
        marks.add(40);
        marks.add(95);
        marks.add(67);
        marks.add(72);
        
        System.out.println("Unsorted Marks: " + marks);
        Collections.sort(marks);
        System.out.println("Sorted Marks: " + marks);
    }
}
