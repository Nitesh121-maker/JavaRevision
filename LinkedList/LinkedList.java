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

    // Searh element in this 
    void search(int searchValue){
        Boolean match = false;
        Node temp = head;
        while(temp.next!=null){
            if (temp.data == searchValue) {
                match = true;
            }
            temp = temp.next;
        }
        if (match == true) {
            System.out.println("This  value  is in the list");
        } else{
            System.out.println("This  value  is not in the list");
        }
    }

    // Delete at Beginiing 
    void deleteAtBeginning(){
        if (head == null) {
            System.out.print("The List is empty!");
            return;
        }

        // Delete at Begining 
        head = head.next;
    }

    // Delete at the End
    void deleteAtEnd(){
        if (head == null) {
            System.out.print("The List is empty!");
            return;
        }
        // If only one node
        if (head.next == null) {
            head = null;
            return;
        }
        
        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp = null;
    }

    // Delete at the position
    void deleteAtPosition(int pos){
        if (head == null) {
            System.out.print("The List is Empty");
        }

        if (pos == 1) {
            head = head.next;
            return;
        }

        Node temp = head;

        for (int i = 0; i < pos-1 && temp!=null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.print("Position out of range");
            return;
        }

        temp.next = temp.next.next;
    }

    // Delete at value
    void deleteByValue(int value){
        if (head == null) {
            System.out.print("List is null!");
            return;
        }

        // if only one node
        if (head.data == value) {
            head = head.next;
            return;
        }
        
        Node temp = head;

        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.print("Value Not Found");
        }

        temp.next = temp.next.next;
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

        System.out.print("Enter the value for search in the List:");
        int searchValue = scan.nextInt();

        link.search(searchValue);

        link.display();

        System.out.println("\nPerforming deletion from start: ");

        link.deleteAtBeginning();
        
        System.out.println("\nList after deletion at begining: ");

        link.display();
  
        System.out.println("\nPerforming deletion at end of the list: ");

        link.deleteAtEnd();

        System.out.println("\nList after the deletion at end: ");

        link.display();

        System.out.println("\nEnter the postion to delete at: ");

        int deletAt = scan.nextInt();

        link.deleteAtPosition(deletAt);

        System.out.println("\nList after the deletion at specific position: ");

        link.display();

        System.out.println("\nEnter the number to delete from the list: ");
        
        int number  =  scan.nextInt();

        link.deleteByValue(number);

        System.out.println("\nList after the deletion of specific degit from the list: ");

        link.display();
    }
}

// Output
// PS C:\JavaSpringRoadmap\LinkedList> javac LinkedList.java
// PS C:\JavaSpringRoadmap\LinkedList> java Main
// Enter the Node data value:43
// Count of Nodes this list have:6
// Enter the Node Position:5      
// Enter the Node data value:78
// Enter the value for search in the List:43
// This  value  is in the list     
// 43->20->40->50->39->78->46->null
// Performing deletion from start: 

// List after deletion at begining:
// 20->40->50->39->78->46->null
// Performing deletion at end of the list:

// List after the deletion at end:
// 20->40->50->39->78->46->null
// Enter the postion to delete at:
// 5

// List after the deletion at specific position:
// 20->40->50->39->78->null
// Enter the number to delete from the list:
// 50

// List after the deletion of specific degit from the list:
// 20->40->39->78->null
// PS C:\JavaSpringRoadmap\LinkedList>
