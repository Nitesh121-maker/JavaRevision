// package LinkedList;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data, Node next){
       this.data = data;
       this.next = next;
    }
}

class LinkedList {
    Node head;

    // Insert at begining 
    void insertAtBeginning(int data, Node next){
        Node NewNode = new Node(data, next);
        NewNode.next = head;
        head = NewNode;
    }
    // Insert in the mid
    void insertAtPosition(int data , int pos){
        if (pos == 1) {
            insertAtBeginning(data, null);
            return;
        }

        Node NewNode = new Node(data, null);

        Node temp = head;

        for (int i = 0; i < pos-1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of range!");
            return;
        }
        NewNode.next = temp.next;
        temp.next = NewNode;
    }
    // Insert at last of list 
    void insert(int data, Node next){
        Node NewNode = new Node(data, next);

        if (head == null) {
            head = NewNode;
            return ;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = NewNode;
    }
    
    // Count the element in the list 
    int countNodes(){
        int count = 0;
        Node temp = head;
        
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+ "->");

            temp = temp.next;
        }

        System.out.print("null");
    }
}

// Main Class
class Main{
    public static void main(String[] args){
        LinkedList link = new LinkedList();
        link.insert(20, null);
        link.insert(40, null);
        link.insert(50, null);
        link.insert(39, null);
        link.insert(46, null);
        System.out.print("Enter the Node data value:");
        Scanner scan = new Scanner(System.in);
        int data = scan.nextInt();

        Node next = null;
        
        // Set the value at beginging 
        link.insertAtBeginning(data,next);
        int count = link.countNodes();
        System.out.print("Count of Nodes this list have:"+count);
        // Set the Value at specific place
        System.out.print("\nEnter the Node Position:");
        int pos = scan.nextInt();

        System.out.print("Enter the Node data value:");
        int specificdata = scan.nextInt();
        
        link.insertAtPosition(specificdata,pos);
        link.display();
    }
}

// Output
// PS C:\JavaSpringRoadmap\LinkedList> javac LinkedList.java
// PS C:\JavaSpringRoadmap\LinkedList> java Main
// Enter the Node data value:67
// Count of Nodes this list have:6
// Enter the Node Position:4
// Enter the Node data value:12
// 67->20->40->50->12->39->46->null
// PS C:\JavaSpringRoadmap\LinkedList>