public class Recursion_SubsequencesOfString {
public static void main (String[] args) {
    String str = "abc";
    subsequences(str, 0, "");

}
public static void subsequences(String str, int idx, String newstr ) {
    if (idx == str.length()) {
        System.out.println(newstr);
        return;
    }
    char currChar = str.charAt(idx);
    subsequences(str, idx+1, newstr + currChar);
    subsequences(str, idx+1, newstr);
}
}