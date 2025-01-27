/*
 * @Author: lucas lantasy.io@gmail.com
 * @Date: 2025-01-26 22:02:34
 * @LastEditTime: 2025-01-26 23:06:37
 * @Description: 
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author purvamsheth
 */
public class Problem6 {
    // Definition for singly-linked list node
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode solution(ListNode head, int n) {
        // WRITE YOUR CODE HERE
        // Create a dummy node before the head to handle the case of removing the head
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;

        // Move the first pointer n+1 steps ahead
        // so that the gap between first and second is n nodes.
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        // Move both pointers until first reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Remove the nth node from the end
        second.next = second.next.next;

        // Return the new head
        return dummy.next;
    }

    // HELPER FUNCTION TO PRINT THE LINKEDLIST
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Example: 1 -> 2 -> 3 -> 4 -> 5, n = 2
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original List: ");
        printList(head);

        int n = 2;

        head = solution(head, n);

        System.out.print("Updated List: ");
        printList(head); // EXPECTED RESULT 1->2->3->5

        // ADD YOUR TEST CASES HERE!!!!
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);

        System.out.print("Original List: ");
        printList(head2);

        head2 = solution(head2, 2);

        System.out.print("Updated List: ");
        printList(head2); // EXPECTED RESULT: 2
    }

}
