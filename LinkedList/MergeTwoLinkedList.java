import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

class Insert  {
    Node headOne;
    Node headTwo;
    // insert in first list
    void firstList(int data){
        Node newNodeOne  =  new Node(data);

        if (headOne == null) {
            headOne = newNodeOne;
            return;
        }

        Node temp = headOne;
        // If the head is not null
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNodeOne;
    }

    // Insert list two
    void secondList(int data){
       Node newNodeTwo = new Node(data);

       if (headTwo == null) {
           headTwo = newNodeTwo;
           return;
       }

       Node temp = headTwo;

       while (temp.next != null) {
           temp = temp.next;
       }

       temp.next = newNodeTwo;
    }
    void merge(){
        // Head is null
        if (headOne == null) {
            headOne = headTwo;
            return;
        }

        // headtwo is null
        if(headTwo == null){
            return;
        }

        Node temp = headOne;

        while (temp.next != null) {
            temp = temp.next;
        }
        
        temp.next = headTwo;
        // Now print the merged list
        System.out.print("Merged List: ");
        Node mergedTemp = headOne;
        while (mergedTemp != null) {
            System.out.print(mergedTemp.data + "->");
            mergedTemp = mergedTemp.next;
        }
        System.out.println("null");
        }
    void display(){
        Node tempOne = headOne;
        Node tempTwo = headTwo;
        
        System.out.print("First List: ");
        while (tempOne != null) {
            System.out.print(tempOne.data+ "->");
            tempOne = tempOne.next;
        }

        System.out.print("null");

        System.out.print("Second List: ");
        while (tempTwo != null) {
            System.out.print(tempTwo.data+"->");
            tempTwo = tempTwo.next;
        }
        System.out.println("null");
    }
}

// Main Class
class MergeTwoLinkedListMain {
    public static void main(String[] args){
        Insert list = new Insert();
        Scanner scanObj = new Scanner(System.in);
        System.out.println("Enter the length of the first list");
        int n = scanObj.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanObj.nextInt();
            list.firstList(arr[i]);
        }
        
        // 2nd list 
        System.out.println("Enter the length of the 2nd list");
        int num = scanObj.nextInt();
        int arrOne[] = new int[num];
        for (int index = 0; index < num; index++) {
            arrOne[index] = scanObj.nextInt();
            list.secondList(arrOne[index]);
        }
        list.merge();
        list.display();
    }
}


