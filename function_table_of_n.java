import java.util.Scanner;

public class function_table_of_n {
    public static void table(int n) {
        for (int i = 1; i <= 10; i++) {
            int s = n*i;
            System.out.println(s);
        }
        
    }
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        table(n);
    }
}
