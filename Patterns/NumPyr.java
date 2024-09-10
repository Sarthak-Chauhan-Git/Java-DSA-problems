package Patterns;

public class NumPyr {
    public static void main(String args[]){
        int row = 5;
        int val = 1;
        for (int i = 0; i < row; i++) {
            // inverted space pyramid
            for(int j=row-1; j>i; j--){
                System.out.print(" ");
            }

            //star
            for(int k=0; k<i+1;k++){
                System.out.print(val+" ");
            }
            val++;

            System.out.println();
        }
    }
}
