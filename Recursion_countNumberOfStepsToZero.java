public class Recursion_countNumberOfStepsToZero {
    public static void numberOfSteps(int n, int count) {
        if (n==0) {
            System.out.println("count = "+count);
            return;
        }
        if(n%2 == 0) {
            System.out.println(n + " is even; divide by 2 and obtain "+n/2);
            numberOfSteps(n/2, count+1);
            
        } else {
             System.out.println(n + " is odd; subtract by 1 and obtain "+(n-1));
            numberOfSteps(n-1, count + 1);
           
        }
    }
    public static void main(String[] args) {
        numberOfSteps(20, 0);
        
    }
    
}
