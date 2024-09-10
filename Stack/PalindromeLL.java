package Stack;

import java.util.*;

public class PalindromeLL {
    public static Stack<Character> s1 = new Stack<>();
    public static Stack<Character> s2 = new Stack<>();
    public static LinkedList<Character> ll = new LinkedList<>();

    public static boolean isPalindrome() { 
        int i = 0, mid = ll.size()/2;
        if (ll.size() % 2 == 0) {
            while(i < mid){
                s1.push(ll.get(i));
                i++;
            }
            i = ll.size()-1;
            while(i>=mid){
                s2.push(ll.get(i));
                i--;
            }
        }
        else{
            mid = (ll.size())/2;
            while(i < mid){
                s1.push(ll.get(i));
                i++;
            }
            i = ll.size()-1;
            while(i > mid){
                s2.push(ll.get(i));
                i--;
            }
        }

        while(!s1.isEmpty() && !s2.isEmpty()){
            char ch1 = s1.pop();
            char ch2 = s2.pop();
            if(ch1 != ch2){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ll.add('A');
        ll.add('B');
        ll.add('C');
        ll.add('B');
        ll.add('A');
        System.out.println(ll);
        System.out.println(isPalindrome());

    }
}