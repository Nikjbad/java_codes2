class Recursion_move_all_x_to_the_end {

    public static void moveall(String str, int idx,int count, String newString) {
       
        if (idx == str.length()) {
            for (int i = 0; i <= count; i++) {
                newString += 'x';
                
            }
            
            System.out.println(newString);
            return;

        }
       
        char currentChar = str.charAt(idx);
        if(currentChar == 'x') {
            count++;
            moveall(str, idx+1, count, newString);
            
          
        } else {
              newString += currentChar;
         moveall(str, idx+1, count, newString);

    }
}
    public static void main(String[] args) {
        String str = "axbcxxd";
       moveall(str, 0, 0, "");

    }
    
}