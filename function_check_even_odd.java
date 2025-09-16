import java.util.Scanner;

public class function_check_even_odd {
    public static void evenodd(int n){
        if(n%2==0){
            System.out.println("it is even number");
        } else{
            System.out.println("it is odd number");
        }
    }
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        evenodd(n);
    }
}
