package BasicDSA.Recursion;

public class FriendPairing {
    public static int pairing(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        int single = pairing(n-1);
        int couple = (n-1)*pairing(n-2);
        return single + couple;
    }
    public static void main(String[] args){
        int n=3;
        System.out.println(pairing(n));
    }
}
