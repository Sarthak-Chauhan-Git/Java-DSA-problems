package BasicDSA.Recursion;

public class num {
    public static void count(int x,int i){
        System.out.print("\t"+x);
        if(x == i){
            return;
        }
        count(x+1,i);
    }
    public static void main(String args[]){
        count(0,10);
    }
}
