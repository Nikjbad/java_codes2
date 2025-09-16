public class recursion_fibonacci {
    public static void printfibonacci(int a, int b, int n) {
        if (n==0){
            
            return;
        }
        System.out.println(a);
        printfibonacci(b, a+b, n-1);
    }
    public static void main(String[] args) {
     
       printfibonacci(0, 1, 5 );
    }
}
