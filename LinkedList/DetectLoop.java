// Detect loop in linked list – Floyd’s cycle detection Algorithm (also called the Tortoise and Hare algorithm)

import java.util.Scanner;

class Node{
    int data ;
    Node next ;

    Node(int data){
        this.data = data;
    }
}

// Insert list 
class InsertLinkedlist {
    Node head ;
    void insert(int data){
        Node newNode = new Node(data);
        // If the head is null so firstly fill this 

        if (head == null) {
            head = newNode;
            return ;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Display the list 
    void display(){
        Node temp = head;
        System.out.println("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Detect Loop
    boolean DetectLoop(){
        Node slow = head;
        Node fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow==fast) {
                return true;
            }
        }
        return false;
    }
}

class DetectLoopMain {
    public static void main(String[] args) {
        // Call the insert method 
        InsertLinkedlist obj = new InsertLinkedlist();
        System.out.println("Enter the length of the list:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean loop;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
            obj.insert(arr[i]);
        }

        obj.display();
        loop = obj.DetectLoop();
        
        if (loop) {
            System.out.println("Loop found in the list");
        }else{
            System.out.println("Loop not found in the list");
        }
    }
}

// PS C:\JavaSpringRoadmap\Linkedlist> java DetectLoopMain  
// Enter the length of the list:
// 3  
// 1
// 3
// 2
// Linked List: 
// 1->3->2->null
// Loop not found in the list