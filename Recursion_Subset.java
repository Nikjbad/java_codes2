
import java.util.ArrayList;

public class Recursion_Subset {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = 3;
        findSubset(n, list);
        
    }
    public static void findSubset( int n, ArrayList<Integer> list) {
        if (n == 0) {
            System.out.println(list);
            return;
        }
        
        findSubset(n-1, list);    
        list.add(n);  
        
        findSubset(n-1, list);
        list.remove(list.size()-1);

      
    }
    
}
