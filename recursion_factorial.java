public class recursion_factorial {
    public static void printfactorial(int n, int fac) {
        if (n==0){
            System.out.println(fac);
            return;
        }
        fac *= n;
        printfactorial(n-1, fac);
    }
    public static void main(String[] args) {
       int n=5;
       printfactorial(n, 1);
    }
}
