import java.util.*;

public class BillGenerator {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("Enter price of pencil :");
        float pencil = sc.nextFloat();
        System.out.println("Enter price of pen :");
        float pen = sc.nextFloat();
        System.out.println("Enter price of eraser :");
        float eraser = sc.nextFloat();

        float net = pen + pencil + eraser;
        double gross = (net*0.18) + net;
        System.out.println("Total amount after tax is : "+gross);
    }
    
}
