public class recursion_place_tiles {
    public static int tile(int n, int m){
     if (n<m){
        return 1;
     }
        if (n==m){
            return 2;
        }
        //vertically place karne ke lia 
       int ver = tile(n-m, m);
       // horizonal place kerne ke lia 
       int hor = tile(n-1, m);
       return ver + hor;

        }
    
    public static void main(String[] args) {
        int n=4, m=4;
        System.out.println(tile(n, m));
    }
}
