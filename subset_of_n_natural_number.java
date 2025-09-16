import java.util.*;
public class subset_of_n_natural_number {
    public static void printsub(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void sub(int n, ArrayList<Integer> subset){
       if(n==0){
        printsub(subset);
        return;
       }
        //add hoga toh
        subset.add(n);
        sub(n-1, subset);

        //na toh
        subset.remove(subset.size()-1);
        sub(n-1, subset);
    }
    public static void main(String[] args) {
        int n = 4;
        ArrayList<Integer> subset = new ArrayList<>();
        sub(n, subset);
    }
}
