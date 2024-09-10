package Stack;

import java.util.Stack;

public class reverseString {
    public static Stack<Character> s = new Stack<>();
    public static void main(String[] args){
        String str = "abc";
        int i = 0;
        while(str.length()-1 >= i){
            s.add(str.charAt(i));
            i++;
        }
        str="";
        while(!s.isEmpty()){
            str = str+s.pop();
        }
        System.out.println(str);
    }
}
