public class Recursion_permutation {
    public static void main (String[] args) {
        String str = "abc";
        printpermutation(str, "");
    }   
    public static void printpermutation(String str, String newstr) {
        if (str.length() == 0) {
            System.out.println(newstr);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String rest = str.substring(0, i) + str.substring(i+1);
            printpermutation(rest, newstr + currChar);
        }
    }
}
