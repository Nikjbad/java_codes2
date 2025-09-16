public class Recursion_first_and_last_Occurance {
 
    public static void main(String[] args) {
        String str = "abcaadefahfagd";
        char element = 'a';     
        Occurance(str, 0, element);
    }
    public static int first = -1;
    public static int last = -1;
  
    public static void Occurance(String str, int idx, char element ) {
        if (idx == str.length()) {
            System.out.println("First = "+first);
            System.out.println("last = "+last);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == element) {
            if (first == -1 ) {
                first = idx;

            } else {
                last = idx;
            }

        }
        Occurance(str, idx + 1, element);

    }
}
