public class recursion_keypad_combination {
    
    public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs",
"tu", "vwx", "yz"};
public static void all(String str, int idx, String comb) {
    if (idx == str.length())
{
    System.out.println(comb);
    return;
}    char currchar = str.charAt(idx);
    String mapping = keypad [currchar - '0'];
    for(int i=0; i<mapping.length(); i++)
    {
        all(str, idx+1, comb + mapping.charAt(i));

    }
    
}
    public static void main(String[] args) {
        String str = "34";
        all(str, 0, "");
        
    }
}
