import java.util.Scanner;

public class length_of_n_strings {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int size = ob.nextInt();
        String array[] = new String[size];
        int s=0;
        for (int i = 0; i < size; i++) {
            array[i] = ob.next();
            s += array[i].length();
            
        }
        System.out.println(s);
    }
}
