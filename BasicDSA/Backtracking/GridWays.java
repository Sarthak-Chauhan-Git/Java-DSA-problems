package BasicDSA.Backtracking;

import BasicDSA.Recursion.fact;

public class GridWays {
    public static int n = 4, m = 5;

    public static int optimizeWays(){
        return (fact.factorial((n-1) + (m-1)))/(fact.factorial(n-1)*fact.factorial(m-1));   //permutation formula
    }

    public static int ways(int i, int j){
        //base cases
        if(i == n-1 && j == m-1){
            return 1;
        }
        if(i == n || j == m){
            return 0;
        }

        //recursion & backtracking
        return ways(i+1, j) + ways(i, j+1);
    }
    public static void main(String[] args){
        System.out.println(ways(0,0));
        System.out.println(optimizeWays());
    }
}
