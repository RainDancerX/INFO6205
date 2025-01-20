/*
 * @Author: lucas lantasy.io@gmail.com
 * @Date: 2025-01-18 23:31:24
 * @LastEditTime: 2025-01-19 15:45:47
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

import java.util.Stack;

public class QueueUsingTwoStacks {
    
    // INITIALIZE TWO STACKS HERE!!
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void enqueue(int x) {
        // WRITE YOUR CODE HERE!!!
        s1.push(x);
    }

    public int dequeue() {
        // WRITE YOUR CODE HERE!!! 
        if(s2.isEmpty()){
            if(s1.isEmpty()){
                throw new RuntimeException("Queue is empty");
            }
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop(); // UPDATE THE RETURN STATEMENT ALSO!!
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
        queue.enqueue(5);
        queue.enqueue(6);
        System.out.println(queue.dequeue()); // EXPECTED RESULT 3
        queue.enqueue(7);
        System.out.println(queue.dequeue()); // EXPECTED RESULT 4
        queue.enqueue(8);
        System.out.println(queue.dequeue()); // EXPECTED RESULT 5
        System.out.println(queue.dequeue()); // EXPECTED RESULT 6
        System.out.println(queue.dequeue()); // EXPECTED RESULT 7
        System.out.println(queue.dequeue()); // EXPECTED RESULT 8
    }
}

