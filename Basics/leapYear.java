import java.util.Scanner;

/*better 
importjava.util.*;
publicclassSolution{
    publicstaticvoidmain(String[]args) {
        Scannersc=newScanner(System.in);
        System.out.print("Input the year: ");
        intyear=sc.nextInt();
        booleanx= (year%4) ==0;
        booleany= (year%100) !=0;
        booleanz= ((year%100==0) && (year%400==0));
        if(x&& (y||z)) {System.out.println(year+" is a leap year");}
        else{System.out.println(year+" is not a leapyear");}}}
*/


public class leapYear {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("Enter year to check leap or not :");
        int year = sc.nextInt();
        boolean flag;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    flag = true;
                } else {
                    flag = false;
                }
            } else {
                flag = true;
            }
        } else {
            flag = false;
        }

        if (flag) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }
}
