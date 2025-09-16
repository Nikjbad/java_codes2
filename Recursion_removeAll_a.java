public class Recursion_removeAll_a {
    public static void main(String[] args) {
        String str = "aabacadaeaf";
        removeA(str, "");
        
        
    }
    public static void removeA(String str, String newstr) {
        if(str.length() == 0) {
            System.out.println(newstr);
        return;

        }
        char currChar = str.charAt(0);
        if(currChar == 'a') {
           removeA(str.substring(1), newstr);

        } else {
            newstr += currChar;
            removeA(str.substring(1), newstr);
        }
    }
    
}
