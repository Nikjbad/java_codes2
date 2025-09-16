public class Recursion_keypad_Combination2 {
    public static void main (String args [])  {
        String str = "23";
        keypad(str, "");

    }
    public static void keypad(String str, String newstr ) {
        if (str.length() == 0) {
            System.out.println(newstr);
            return;
        }
        String keypad[] = {
            ".",    //0
            "abc",  //1
            "def",  //2
            "ghi",  //3
            "jkl",  //4
            "mno",  //5
            "pqr",  //6
            "stu",  //7
            "vwx",  //8
            "yz"    //9
        };
        int idx = str.charAt(0) - '0';
        String letters = keypad[idx];
        for (int i = 0; i < letters.length() ; i++) {
            char currentChar = letters.charAt(i);
            keypad(str.substring(1), newstr + currentChar);
            
        }
    }
    

}
