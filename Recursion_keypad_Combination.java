public class Recursion_keypad_Combination {
    public static String[] keypad = {
        
        ".",    // 0
        "abc",  // 1
        "def",  // 2
        "ghi",  // 3
        "jkl",  // 4
        "mno",  // 5
        "pqrs", // 6
        "tuv",  // 7
        "wxyz"  // 8
    };
    public static void mobile(String str, int idx, String combination) {
         if (idx == str.length()) {
          System.out.println(combination);
          return;
         }
       char currChar = str.charAt(idx);
       String mapping = keypad[currChar - '0'];
       for (int i = 0; i < mapping.length(); i++) {
        mobile(str, idx + 1, combination + mapping.charAt(i));
           
       }
    }
    public static void main (String args[]) {
        String str = "23";
        mobile(str, 0, "");

    }
    
}
