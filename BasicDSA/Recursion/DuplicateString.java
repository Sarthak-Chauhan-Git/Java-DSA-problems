package BasicDSA.Recursion;

public class DuplicateString {
    public static void filterString(String str, StringBuilder newStr, boolean[] map, int idx){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        char ch = str.charAt(idx);
        int i = ch-'a';
        if(map[i] == true){
            filterString(str, newStr, map, idx+1);
        }
        else{
            map[i] = true;
            filterString(str, newStr.append(ch), map, idx+1);
        }
    }
    public static void main(String[] args){
        String str = "appnacollege"; 
        filterString(str, new StringBuilder(), new boolean[26], 0);
    }
}
