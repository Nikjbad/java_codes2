public class Recursion_reverseOfNumber {
    public static int rev = 0;
    public static void reverse(int n) {
        if (n == 0) {
            return;
        }
        int num = n % 10 ;
         rev = rev * 10 +num;
          reverse(n / 10);
    }
    public static void main(String[] args) {   
      reverse(12345); // Output: 54321
      System.out.println(rev);
    }    
}
