public class recursion_x_power_n {
    public static int power(int x, int n) {
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int x_ = power(x, n-1);
        int xn = x*x_;
        return xn;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int ans = power(x, n);
        System.out.println(ans);
    }
}
