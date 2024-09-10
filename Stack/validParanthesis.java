package Stack;

import java.util.Stack;

public class validParanthesis {
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();
        for(int i = 0; i<=str.length()-1; i++){
            if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '['){
                s.push(str.charAt(i));
            }
            else if(str.charAt(i) == ')' || str.charAt(i) == '}' || str.charAt(i) == ']'){
                if(str.charAt(i) == ')' && s.peek() != '('){
                    return false;
                }
                else if(str.charAt(i) == '}' && s.peek() != '{'){
                    return false;
                }
                else if(str.charAt(i) == ']' && s.peek() != '['){
                    return false;
                }
                s.pop();
            }
            else{
                System.out.println("Invalid characters found");
                return false;
            }
        }
        if(!s.isEmpty()){
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        String str = "({[]}())";
        System.out.println(isValid(str));
    }
}
