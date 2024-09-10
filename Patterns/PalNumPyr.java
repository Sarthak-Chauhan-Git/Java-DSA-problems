package Patterns;

public class PalNumPyr {
    public static void main(String args[]){
        int row = 5;
        for(int i=0; i<row; i++){
            int num = 6;
            //inverted space pyramid
            for(int j=row-1; j>i; j--){
                System.out.print("*");
            }

            //value printer
            for(int k=row;k>=row-i; k--){
                num--;
                System.out.print(num);
            }
            for(int l=0, temp=2; l<i; l++,temp++){
                System.out.print(temp);
            }
            System.out.println();
        }
    }
}
