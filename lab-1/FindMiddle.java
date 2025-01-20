/*
 * @Author: lucas lantasy.io@gmail.com
 * @Date: 2025-01-18 23:31:24
 * @LastEditTime: 2025-01-19 17:32:25
 * @Description: 
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Purvam Sheth
 */

import java.lang.Math;

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

        if(head == null){
            return null;
        }

        int count = 0;
        Node midNode = head;

        // First traversal to get he length
        while(head != null){
            head = head.next;
            count++;
        }

        // calculate the mid point
        int mid = (int) count / 2;
        
        // Second traversal to get the midNode
        for(int i = 0; i < mid; i++){
            midNode = midNode.next;
        }
        return midNode; /// UPDATE THE RETURN STATEMENT ALSO!!!!
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
        
        // ADD YOUR TEST CASES HERE!!! 1->2->3->4->5->6->7->8->9->10
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);
        head1.next.next.next.next.next = new Node(6);
        head1.next.next.next.next.next.next = new Node(7);
        head1.next.next.next.next.next.next.next = new Node(8);
        head1.next.next.next.next.next.next.next.next = new Node(9);
        head1.next.next.next.next.next.next.next.next.next = new Node(10);
        Node middle1 = findMiddle(head1);
        System.out.println("Middle Node: " + (middle1 != null ? middle1.data : "Empty List")); // EXPECTED RESULT: 3
    }
}