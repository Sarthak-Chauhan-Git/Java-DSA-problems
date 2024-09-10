package Stack;

import java.util.Stack;

public class duplicateParanthesis {
    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            if(curr == ')'){    //closing
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count < 1){  //duplicate
                    return true;
                }
            }
            else{
                s.push(curr);
            }
        }
        return false;
    }
    public static void main(String[] args){
        //String str = "((a+b)+(c+d))";
        String str2 = "((a+b))";
        System.out.println(isDuplicate(str2));
    }
}
