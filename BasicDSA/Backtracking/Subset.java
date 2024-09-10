package BasicDSA.Backtracking;

public class Subset {
    public static void subset(String str, String ans, int i){
        //base
        if(i >= str.length()){
            if(ans.length() == 0){
                System.out.println("NULL");
            }
            System.out.println(ans);
            return;
        }
        //recursion
        char ch = str.charAt(i);
        subset(str, ans+ch, i+1);   //yes
        subset(str, ans, i+1);      //no
    }
    public static void main(String [] args){
        String str = "abc";
        subset(str,"",0);
    } 
    
}