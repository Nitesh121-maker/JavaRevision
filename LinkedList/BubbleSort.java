// define Node

import java.util.Scanner;

class Node{
    int data;
    Node next;

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}
class List{
    Node head;

    void InsertList(int data, Node next){
       Node NewNode = new Node(data, next);
    
       // Check the head if it is null then insert the first value in it   
       if (head == null) {
          head = NewNode;
          return;
       }

       Node temp = head;

       while (temp.next != null) {
          temp = temp.next;
       }

       temp.next = NewNode;
    }

    // Sort the list using bubble sort
    void bubblesort() {
        if (head == null) return;
    
        boolean swapped;
        Node end = null;  // marks the sorted part at the end
    
        do {
            swapped = false;
            Node current = head;
    
            while (current.next != end) {
                if (current.data > current.next.data) {
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
            end = current;  // shrink the unsorted part
        } while (swapped);
    }
    

    // Display method
    void display(){
        Node temp = head;

        // Run loop until the temp temp != null

        while (temp  != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }
}
class BubbleSortMain {
    public static void main(String[] args){
        List linked = new List();

        System.out.println("Enter the list length");
        Scanner scan =  new Scanner(System.in);
        int n = scan.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
            // Call the insert method
            linked.InsertList(arr[i], null);
        }
        System.out.println("List Before Sort");
        linked.display();
        System.out.println("List After Sort");
        
        linked.bubblesort();
        linked.display();
    }
}

// PS C:\JavaSpringRoadmap\Linkedlist> java BubbleSortMain  
// Enter the list length
// 5
// 1
// 2
// 55
// 44
// 12
// List Before Sort
// 1->2->55->44->12->null
// List After Sort
// 1->2->12->44->55->null
// PS C:\JavaSpringRoadmap\Linkedlist> 