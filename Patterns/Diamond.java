package Patterns;

public class Diamond {
    public static void main(String args[]) {
        int row=4;

        // first half
        for (int i = 0; i < row; i++) {
            // inverted space pyramid
            for(int j=row-1; j>i; j--){
                System.out.print(" ");
            }

            //star
            for(int k=0; k<i+1;k++){
                System.out.print("*");
            }
            for(int l=0; l<i; l++){
                System.out.print("*");
            }

            System.out.println();
        }

        //second half
        for(int i=0; i<row; i++){
            //space pyramid
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }

            //star
            for(int k=row; k>i; k--){
                System.out.print("*");
            }
            for(int l=row-1; l>i; l--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
