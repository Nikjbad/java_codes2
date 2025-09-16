public class recursion_subsequences {
    public static void subsequences(String str, int idx, String newstr)
    {
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }
        char currchar = str.charAt(idx);
        //to be
         subsequences(str, idx+1, newstr + currchar);
        //to not be
        subsequences(str, idx+1, newstr);
    }
    public static void main(String[] args) {
        String str = "abc";
        subsequences(str, 0, "");
    }
    
}
