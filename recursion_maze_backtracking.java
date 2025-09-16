public class recursion_maze_backtracking {
    public static int maze(int i, int j, int m, int n){

        if (i==n || j==m){
            return 0;
        }
if(i == n-1 && j == m-1){
    return 1;
}
        //i ke lia
       int down = maze(i+1, j, m, n);
        //j ke lia
       int right = maze(i, j+1, m, n);
       return down + right;
    }
    public static void main(String[] args) {
        int m = 4;
        int n = 2;
        int prr = maze(0, 0, m, n);
        System.out.println(prr);
    }
}
