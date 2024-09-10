package Patterns;

public class ByTri {
    public static void main(String args[]) {

        int num = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(num);
                if (num == 1) {
                    num--;
                } else {
                    num++;
                }
            }
            System.out.println();
        }
    }
}
