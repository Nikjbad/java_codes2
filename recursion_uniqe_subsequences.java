import java.util.*;
public class recursion_uniqe_subsequences {
    public static void subsequences(String str, int idx, String newstr, HashSet<String> set)
    {
        if(idx == str.length()){
           if(set.contains(newstr)){
            return;
           }else{
            System.out.println(newstr);
            set.add(newstr);
            return;
           }
        }
        char currchar = str.charAt(idx);
        //to be
         subsequences(str, idx+1, newstr + currchar, set);
        //to not be
        subsequences(str, idx+1, newstr,set);
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subsequences(str, 0, "", set);
    }
    
}


