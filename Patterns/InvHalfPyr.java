package Patterns;

public class InvHalfPyr {
    public static void main(String args[]){
        int n=4;
        for(int i=0; i<n; i++){
            for(int j=n; j>i; j--){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
