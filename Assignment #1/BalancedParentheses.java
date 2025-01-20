/*
 * @Author: lucas lantasy.io@gmail.com
 * @Date: 2025-01-18 23:31:24
 * @LastEditTime: 2025-01-19 18:13:00
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

public class BalancedParentheses {
    public static boolean isBalanced(String s) {
        Stack<Character> newStack = new Stack<>();
        for(char ch:s.toCharArray()) {
            if(ch != ')' & ch!= '}' & ch!= ']') 
                newStack.push(ch);
            else{
                if(newStack.isEmpty()){
                    return false;
                }
                char tmp = newStack.pop();
                switch(ch){
                    case ')':
                        if(tmp != '(') return false;
                            break;
                    case '}':
                        if(tmp != '{') return false;
                            break;
                    case ']':
                        if(tmp != '[') return false;
                            break;
                    default:
                        return false;
                }
            }
        }
        return true; // UPDATE THIS LINE OF CODE ALSO!
    }

    public static void main(String[] args) {
        // SAMPLE CASE 1
        String input1 = "({[()]})";
        System.out.println(isBalanced(input1) ? "Balanced" : "Not Balanced"); // EXPECTED RESULT: Balanced
        // SAMPLE CASE 2
        String input2 = "({){})))";
        System.out.println(isBalanced(input2) ? "Balanced" : "Not Balanced"); // EXPECTED RESULT : Not Balanced
        // ADD YOUR TEST CASES HERE!!!
        String input3 = "(({()}))";
        System.out.println(isBalanced(input3) ? "Balanced" : "Not Balanced"); // EXPECTED RESULT : Balanced
        String input4 = "(({([[])}))";
        System.out.println(isBalanced(input4) ? "Balanced" : "Not Balanced"); // EXPECTED RESULT : Not Balanced
    }
}

