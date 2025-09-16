public class hollow_rhombus {
    public static void main(String[] args) {
        int n=4, v=5;
        for (int i = 1; i <=v; i++) {
            for (int j = 1; j <= n; j++){
                
            
            System.out.print(" ");
        }
        n--;
        for (int j = 1; j <= 5; j++) {
            if(i==1 || i==v || j==1 || j==5 ){

                System.out.print("*");
            } else{
                System.out.print(" ");
            }
            
        }
        System.out.println();
        }
}
}
