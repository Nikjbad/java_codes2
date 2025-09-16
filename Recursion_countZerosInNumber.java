public class Recursion_countZerosInNumber {
    public static void countZero(int n, int count ) {
        if (n == 0) {
            System.out.println(count);
            return;
        }
        if(n%10 == 0) {
            count++;

        }
        countZero((n/10), count);


    }
    public static void main(String[] args) {
        countZero(15012100, 0); // Output: 3
        
        
    }
    
}
