/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Purvam Sheth
 */
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class FindMiddle {
    
    public static Node findMiddle(Node head) {
        // WRITE YOUR CODE HERE!!!

        return new Node(1); /// UPDATE THE RETURN STATEMENT ALSO!!!!
    }

    public static void main(String[] args) {
        
        // SAMPLE CASE 1 || 1->2->3->4->5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        Node middle = findMiddle(head);
        System.out.println("Middle Node: " + (middle != null ? middle.data : "Empty List")); // EXPECTED RESULT: 3
        
        // ADD YOUR TEST CASES HERE!!!
    }
}

