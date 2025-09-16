public class recursion_move_all_x_to_end {
    public static void move(String str, int idx,int c, String newstr){
        if (idx == str.length()){
            for (int i = 1; i <= c; i++) {
                newstr += 'x';
               
            }
            System.out.println(newstr);
            return;
        }
     
        char currchar = str.charAt(idx);
        if (currchar == 'x'){
           c++;
           move(str, idx+1, c, newstr);
        } else {
            newstr += currchar;
            move(str, idx+1, c, newstr);
        }
        
    }
    public static void main(String[] args) {
        String str = "nixxkxhxixl";
        move(str, 0, 0, "");
        
    }
    
}
