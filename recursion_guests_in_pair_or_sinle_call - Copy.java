public class recursion_guests_in_pair_or_sinle_call {
    public static int guest(int n){
  if (n<=0){
    return 1;
  }
        int a = guest(n-1);
        int b = (n-1) * guest(n-2);
        return a + b;
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(guest(n));
    }
}
