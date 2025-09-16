public class Recursion_starTriangle {
    public static void main(String[] args) {
        triangle(4, 0);
        triangle2(4, 0);
        
    }
    public static void triangle( int i, int j) {
        if (i == 0) {
            return;
        }
        if (i > j) {
            System.out.print("* ");
             triangle( i , j + 1);
        } else {
            System.out.println();
            triangle(i - 1, 0);
            
        }
    }
    public static void triangle2( int i, int j) {
        if (i == 0) {
            return;
        }
        if (i > j) {
           
             triangle2( i , j + 1);
              System.out.print("* ");
        } else {
            
            triangle2(i - 1, 0);
            System.out.println();
            
        }
    }
    
}
