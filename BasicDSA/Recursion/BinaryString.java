package BasicDSA.Recursion;

public class BinaryString {
    public static void byString(int n, int i, String newStr){
        if(n == 0){
            System.out.println(newStr);
            return;
        }
        byString(n-1, 0, newStr+"0");
        if(i == 0){
            byString(n-1, 1, newStr+"1");
        }
    } 
    public static void main(String args[]){
        int n=5;
        byString(n, 0, "");
    }  
}
