
import java.util.HashSet;

public class Recursion_UniqueSubsequencesOfString {
    
       public static void subsequences(String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) {
            if(set.contains(newString)){
                return; // Skip if the subsequence is already present
            }
            set.add(newString); // Add the new subsequence to the set
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(idx);
        // to be 
        subsequences(str, idx+1, newString + currentChar, set);
        //not to be 
        
        subsequences(str, idx+1, newString, set);

    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subsequences(str, 0, "", set);
        
    }
    
}
