package Patterns;

public class Butterfly {
    public static void pyr(int row, String val){

        //first half
        for(int i=0; i<row; i++){
            //half star pyramid
            for(int j=0; j<i; j++){
                System.out.print(val);
            }
            //inverted space pyramid
            for(int k=1; k<row-i; k++){
                System.out.print(" ");
            }
            //inverted rotated space pyramid
            for(int l=row-1; l>i; l--){
                System.out.print(" ");
            }
            //half star pyramid
            for(int j=0; j<i; j++){
                System.out.print(val);
            }

            System.out.println();
        }

        //second half
        for(int i=1; i<=row; i++){
            //inverted half star pyramid
            for(int j=row; j>i; j--){
                System.out.print(val);
            }
            //space pyramid
            for(int k=0; k<i-1; k++){
                System.out.print(" ");
            }
            //rotated space pyramid
            for(int l=0; l<i-1; l++){
                System.out.print(" ");
            }
            //inverted rotated half star pyramid
            for(int j=row; j>i; j--){
                System.out.print(val);
            }

            System.out.println();
        }
    }
    public static void main(String args[]){
        pyr(5,"*");
    }
}
