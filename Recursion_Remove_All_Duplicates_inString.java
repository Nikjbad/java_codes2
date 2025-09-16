

class Recursion_Remove_All_Duplicates_inString {
public static void main(String[] args) {
    String str = "aabbasssss";
    removeDuplicates(str, 0, "");
    
}
public static boolean[] map = new boolean[26];
public static void removeDuplicates(String str, int idx, String newstr) {
    if (idx == str.length()) {
        System.out.println(newstr);
        return;
    }
    char currChar = str.charAt(idx);
    if (map[currChar - 'a'] == true) {
        removeDuplicates(str, idx + 1, newstr);
    } else {
        newstr += currChar;
        map[currChar - 'a'] = true;
        removeDuplicates(str, idx + 1, newstr);
    }
    
}

}