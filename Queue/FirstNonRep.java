package Queue;
import java.util.*;

public class FirstNonRep {
    public static Queue<Character> q = new LinkedList<>();
    public static void nonRep(String str){

        int[] freq = new int[26];
        int i = 0;
        while(i<str.length()){
            char ch = str.charAt(i);
            q.add(ch);
            int pos = ch - 'a';
            freq[pos]++;
            if(freq[pos] == 1){
                
            }else{
                while(!(q.isEmpty())){
                    if(freq[q.peek()-'a'] == 1){
                        break;
                    }
                    q.remove();
                }
            }
            i++;
            if(q.isEmpty()){
                System.out.println("-1");
            }else{
                System.out.println(q.peek());
            }
        }
    }
    public static void main(String[] args){
        String str = "aabccxb";
        nonRep(str);
    }
}
