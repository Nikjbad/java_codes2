import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int m = ob.nextInt();
          int matrix[][] = new int[n][m];
          for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix [i][j]= ob.nextInt();
                
            }
        }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(matrix[j][i]);
                    
                }
                System.out.println();
          }
        }
}
