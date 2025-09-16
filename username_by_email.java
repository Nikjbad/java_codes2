import java.util.*;
public class username_by_email {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter your email: ");
        String email = ob.next();
        String result = "";
        for (int i = 0; i < email.length(); i++) {
            if(email.charAt(i)== '@'){
               break; 
            }
            else{
                result += email.charAt(i);
            }
        }
        System.out.println("Username: "+result);

    }
}
