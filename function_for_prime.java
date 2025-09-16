import java.util.Scanner;

public class function_for_prime {
public static void prime(int n) {
    int c=0;
    for (int i = 1; i <= n; i++){
        if(n%i==0){
            c++;
           }
           }
        if(c==2){
            System.out.print("it is a prime number");
        } else {
            System.out.println("it is not a prime number");
        
        return;
    }
    
}
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        prime(n);
    }
}
