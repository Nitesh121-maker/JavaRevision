// package LinkedList;

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

        link.display();
    }
}