// Reversed Linked List

import java.util.Scanner;

class LinkedListNode{
    int data;
    LinkedListNode next;

    LinkedListNode(int data,LinkedListNode next){
        this.data = data;
        this.next = next;
    }
}

class ReversedLinkedList {
    LinkedListNode  head;
    // Inset the List
    void insert(int data, LinkedListNode next){
        LinkedListNode newNode = new LinkedListNode(data, next);

        // If The head is empty 
        if (head == null) {
            head = newNode;
            return;
        }
        
        LinkedListNode temp = head;
        
        while (temp.next != null) {
            temp = temp.next;
        }
        
        temp.next = newNode;
    }

    // reverse the list

    void ReverseList(){
        LinkedListNode prev = null;
        LinkedListNode current  = head;
        LinkedListNode next;

        while (current!=null) {
            next = current.next;
            current.next = prev;     // step 2: reverse link
            prev = current;          // step 3: move prev
            current = next; 
        }
        
        head = prev;
    }

    void display(){
        LinkedListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");

            temp = temp.next;
        }

        System.out.print("null");
    }
}

class LinkedListRevMain{
    public static void main(String[] args){
        ReversedLinkedList rev = new ReversedLinkedList();
        System.out.println("Enter the length: ");
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int arr[] = new int[len];
        System.out.println("\nEnter the List: ");
        for (int i = 0; i < len; i++) {
            arr[i] = scan.nextInt();
            rev.insert(arr[i], null);
        }
        
        rev.display();
        rev.ReverseList();
        System.out.print("\nAfter Reversed list:");
        rev.display();
    }
}