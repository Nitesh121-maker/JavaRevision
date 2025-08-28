import java.util.ArrayList;

public class NameArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Nitesh");
        names.add("Shakti");
        names.add("Sheetal");
        
        if(names.size()>1) {
            System.out.println("\nSecond place name: "+names.get(1));
        }else{
            System.out.println("There are not enough names in the list to retrieve the second one.");
        }
       
    }
    
}
