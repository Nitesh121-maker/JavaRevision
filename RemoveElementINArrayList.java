import java.util.ArrayList;
import java.util.Scanner;

class RemoveElement{
    ArrayList<Integer> remove(int num){
        ArrayList<Integer> element = new ArrayList<>();
        element.add(10);
        element.add(10);
        element.add(20);
        element.add(40);
        element.add(50);

        System.out.println("Element Before Remove: "+element);
        element.remove(Integer.valueOf(num));
        System.out.println("Element After Remove: "+element);
        return element;
    }
}

class CallRemove{
    public static void  main(String[] args){
        System.out.println("Enter the number to be removed");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        RemoveElement removeElement = new RemoveElement();
        removeElement.remove(num);
        scan.close();
    }
}