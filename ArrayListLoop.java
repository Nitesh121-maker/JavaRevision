import java.util.ArrayList;

public class ArrayListLoop {
    public static void main(String[] args){
        ArrayList<String> name = new ArrayList<>();
        name.add("Nitesh Chauhan");
        name.add("Chetan");
        name.add("Hitansh");
        name.add("Savitri");
        System.out.println("List of Names:");
        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i));
        }
        System.out.println("List of Names using foreach:");
        for (String names : name) {
            System.out.println(names);
        }
    }
}
