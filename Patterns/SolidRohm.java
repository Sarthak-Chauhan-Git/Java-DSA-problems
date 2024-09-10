package Patterns;

public class SolidRohm {
    public static void main(String args[]){
        int row =5;
        for(int i=0; i<row; i++){
            //inverted space pyramid
            for(int j=row-1; j>i; j--){
                System.out.print(" ");
            }
            //stars
            for(int k=0; k<4; k++){
                System.out.print("*");
            } 
            System.out.println();
        }
    }
}
