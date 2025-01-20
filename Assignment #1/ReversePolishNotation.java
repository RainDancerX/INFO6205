/*
 * @Author: lucas lantasy.io@gmail.com
 * @Date: 2025-01-18 23:31:24
 * @LastEditTime: 2025-01-19 18:47:48
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

public class ReversePolishNotation {
    
    public static int evalRPN(String[] tokens) {
        // WRITE YOUR CODE HERE!!!
        Stack<Integer> s = new Stack<>();

        for(String str:tokens){
            if(!str.equals("+") && !str.equals("-") && !str.equals("*") && !str.equals("/")){
                s.push(Integer.parseInt(str));
            }else {
                int right = s.pop();
                int left = s.pop();
                switch(str){
                    case "+":
                        s.push(left + right);
                        break;
                    case "-":
                        s.push(left - right);
                        break;
                    case "*":
                        s.push(left * right);
                        break;
                    case "/":
                        if (right == 0) {
                            throw new ArithmeticException("Division by zero is not allowed.");
                        }
                        s.push(left / right);
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown operator: " + str);
                }
            }
        }

        return s.pop(); // UPDATE THIS LINE OF CODE ALSO !!!!
    }

    public static void main(String[] args) {
        
        // SAMPLE CASE 1
        String[] tokens1 = {"2", "1", "+", "3", "*"};
        System.out.println("Result: " + evalRPN(tokens1)); // Output: 9

        // SAMPLE CASE 2
        String[] tokens2 = {"4", "13", "5", "/", "+"};
        System.out.println("Result: " + evalRPN(tokens2)); // Output: 6

        // Test Case
        String[] tokens3 = {"10", "2", "/", "5", "+"};
        System.out.println("Result: " + evalRPN(tokens3)); // Output: 10

    }
}