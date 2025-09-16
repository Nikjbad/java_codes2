import java.util.*;
public class replace_char_string {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String str = ob.nextLine();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)== 'e'){
               result += 'i'; 
            }
            else{
                result += str.charAt(i);
            }
        }
        System.out.println(result);

    }
}
