package Patterns;

public class InvNumPyr {
    public static void main(String args[]) {

        int num = 1;
        for (int i = 0; i < 5; i++) {
            for(int j=5; j>i; j--){
                System.out.print(num);
                num++;
            }
            num=1;
            System.out.println();
        }
    }
}
