public class recursion_sum_of_n_number {
    public static void printsum(int n, int sum) {
        if (n==0){
            System.out.println(sum);
            return;
        }
        sum += n;
        printsum(n-1, sum);
    }
    public static void main(String[] args) {
       int n=5;
        printsum(n, 0);
    }
}
