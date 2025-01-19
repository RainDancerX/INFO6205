/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Purvam Sheth
 */

import java.util.Stack;

public class QueueUsingTwoStacks {
    
    // INITIALIZE TWO STACKS HERE!!

    public void enqueue(int x) {
        // WRITE YOUR CODE HERE!!!
    }

    public int dequeue() {
        // WRITE YOUR CODE HERE!!! 
        return 1; // UPDATE THE RETURN STATEMENT ALSO!!
    }

    public static void main(String[] args) {
        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();
        
        // SAMPLE CASE 1
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.dequeue()); // EXPECTED RESULT 1
        queue.enqueue(4);
        System.out.println(queue.dequeue()); // EXPECTED RESULT 2
        
        // ADD YOUR TEST CASES HERE!!!
        
    }
}

