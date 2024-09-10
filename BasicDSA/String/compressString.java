package BasicDSA.String;
import java.util.Scanner;

public class compressString {
    public static Scanner sc = new Scanner(System.in);

    public static String comString(String str) {
        String com = "";
        char ch;
        int count = 0;
        if(str.length() == 0)return com+="-1";
        ch = str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (count == 0) {
                ch = str.charAt(i);
            }
            if (ch == str.charAt(i)) {
                count++;
            }
            if (i == str.length()-1) {
                com += ch;
                    com += count;
                break;
            } else {
                if (ch != str.charAt(i + 1)) {

                    com += ch;
                    com += count;
                    count = 0;
                    ch = str.charAt(i);
                }
            }
        }

        return com;
    }

    public static void main(String args[]) {
        String str = "aaabbcccdd";
        System.out.println("Original string : " + str);
        System.out.println("Compressed string : " + comString(str));
    }
}