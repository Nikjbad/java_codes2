public class recursion_permutation_of_string {
    public static void perm(String str, String newstr){
        if (str.length()==0){
            System.out.println(newstr);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            
      
        char currchar = str.charAt(i);
        String ad = str.substring(0,i) + str.substring(i+1);
        perm(ad, newstr + currchar);
        }
    }
    public static void main(String[] args) {
       String str = "abc";
        perm(str, "");
        
    }
}
