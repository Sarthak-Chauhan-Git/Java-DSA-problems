/*package Stack;

import java.util.*;

public class StringDecoder {
    public static String decode(String str){
        Stack<Character> s = new Stack<>();
        String temp = "",ans = "";
        int i = 0;

        //Fill stack
        while(i < str.length()){
            s.push(str.charAt(i));
            i++;
        }
        System.out.println(s);


        while(i > 0){
            if(s.isEmpty()){
                return ans;
            }
            char ch = s.pop();
            if(ch == ']'){
                ch = s.pop();
                while(ch != '['){
                    ans = temp;
                    temp+=ch;
                    ch = s.pop();
                }/
            }
            System.out.println(temp);
            if(ch > '0' && ch < '9'){
                int j = (ch-'0');
                System.out.println(j);
                while (j >= 0) {
                    temp+=temp;
                    j--;
                }
            }
            System.out.println(temp);
            i--;
        }


        return temp;
    }
    public static void main(String[] args){
        String str = "2[cv]";
        System.out.println(decode(str));
    }
}*/
