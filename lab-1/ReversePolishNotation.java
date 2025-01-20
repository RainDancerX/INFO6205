/*
 * @Author: lucas lantasy.io@gmail.com
 * @Date: 2025-01-18 23:31:24
 * @LastEditTime: 2025-01-19 18:21:48
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
        Stack<String> s = new Stack<>();

        for(String str:tokens){
            if(str != "+" && str != "-" && str != "*" && str != "/"){
                s.push(str);
            }else {
                int right = Integer.parseInt(s.pop());
                int left = Integer.parseInt(s.pop());
                switch(str){
                    case "+":
                        s.push(Integer.toString(left + right));
                        break;
                    case "-":
                        s.push(Integer.toString(left - right));
                        break;
                    case "*":
                        s.push(Integer.toString(left * right));
                        break;
                    case "/":
                        s.push(Integer.toString(left / right));
                        break;
                }
            }
        }

        return Integer.parseInt(s.pop()); // UPDATE THIS LINE OF CODE ALSO !!!!
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