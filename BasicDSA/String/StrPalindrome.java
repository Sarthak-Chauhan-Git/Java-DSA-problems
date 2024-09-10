package BasicDSA.String;
public class StrPalindrome {
    public static boolean isPalindrome(String str){
        int len = str.length();
        int mid = 0;
        if(len%2==0){
            mid = (len/2)+1;
        }
        else{
            mid = len/2;
        }
        for(int i=0,j=len-1;i<=mid;i++,j--){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
        }
        
        return true;
    }
    public static void main(String args[]){
        String str = "noon";
        if(isPalindrome(str)){
            System.out.println("It is palindrome!");
        }
        else{
            System.out.println("Not palindrome!");
        }
    }
}
