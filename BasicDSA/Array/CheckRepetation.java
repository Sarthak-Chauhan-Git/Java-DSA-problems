package BasicDSA.Array;

public class CheckRepetation {
    public static boolean checkRep(int num[]){
        for(int i=0; i<num.length; i++){
            int curr = num[i];
            for(int j=i+1; j<num.length; j++){
                if(curr==num[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int num[]={1,2,3,4};
        if(checkRep(num)){
            System.out.print("True");
        }
        else{
            System.out.println("False");
        }
    }
}
