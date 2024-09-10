package GreedyAlgo;

public class KthOddNum {

    // approach 1: O(k) This will give range of k odd elements
    public static void kOdd(int high, int low, int k) {
        int odd = 0;
        while (high >= low && k > 0) {
            if (high % 2 != 0) {
                odd = high;
                System.out.println(odd);
                k--;
            }
            high--;
        }
    }

    // approach 2: O(1) This will only give kth odd element
    public static int kthOdd(int L, int R, int K) {
        if (K <= 0)     //Base case
            return 0;

        //We used bitwise & to check for odd or even R&1 gives least significant bit and if LSB is 1 then it is odd or 0 then even. 
        //This will check if upper bound is odd or even
        if ((R & 1) > 0) {          
            //Math.ceil function is to round off values. This function counts no. of odd in range
            int Count = (int) Math.ceil((R - L + 1) / 2);   
            if (K > Count)  //Check if we have enough no. in range or not
                return 0;
            else return(R - 2 * K + 2); //this will give exact value of kth odd element in odd case
        } else {
            int Count = (R - L + 1) / 2;    
            if (K > Count)
                return 0;
            else return(R - 2 * K + 1); //this will give exact value of kth element in even case
        }
    }
    public static void main(String[] args) {
        int l = -3, r = 3, k = 1;
        System.out.println("Range of k odd element in range : ");
        if (l > r) {
            kOdd(l, r, k);
        } else {
            kOdd(r, l, k);
        }
        System.out.println("Kth odd element : "+kthOdd(l,r,k));
    }
}
