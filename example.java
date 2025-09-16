class example {

    public static void main(String[] args) {
        int i = 5;
        func(i);
    }
    public static void func(int i ) {
        if (i == 0) {
            return;
        }
          System.out.println(i);
        func(i - 1);
      
       
    }
}