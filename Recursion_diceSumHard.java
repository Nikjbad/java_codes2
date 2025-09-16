public class Recursion_diceSumHard {
    public static void main(String[] args) {
        int target = 4;
        dice("", target);
        
    }
    public static void dice(String n, int target ) {
        if (target <= 0) {
            System.out.println(n);
            return;
        }
        for(int i = 1; i<=6 && i<=target; i++) {
            dice(n + i, target - i);
        }
    }
}
