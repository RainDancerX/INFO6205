/*
 * @Author: lucas lantasy.io@gmail.com
 * @Date: 2025-01-26 22:02:34
 * @LastEditTime: 2025-01-26 22:54:49
 * @Description: 
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Stack;

/**
 *
 * @author purvamsheth
 */

public class Problem5 {

    public static int solution(String s) {
        // WRITE YOUR CODE HERE!!!!
        if (s == null || s.length() < 2)
            return 0;

        Stack<Integer> stack = new Stack<>();
        // Initialize with -1 as base index
        stack.push(-1);
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.empty()) {
                    stack.push(i);
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "(()))())(";
        System.out.println("Longest Valid Parentheses: " + solution(s)); // EXPECTED RESULT 4

        // ADD YOU TEST CASES HERE!!!
        String s1 = "()";
        System.out.println("Test 1: " + solution(s1)); // Expected: 2

        String s2 = ")()()";
        System.out.println("Test 2: " + solution(s2)); // Expected: 4

        String s3 = "";
        System.out.println("Test 3: " + solution(s3)); // Expected: 0

        String s4 = "(((()))))";
        System.out.println("Test 4: " + solution(s4)); // Expected: 8
    }

}
