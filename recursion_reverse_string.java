public class recursion_reverse_string {
   
        public static void revString(String str, int idx) {
       if (idx == 0){
          System.out.print(str.charAt(idx));
          return;
       }

            System.out.print(str.charAt(idx));
            revString(str, idx-1);
    }
        public static void main(String args[]) 
        {
        
        String str = "abcd";
        revString(str, str.length()-1);
        }
        }
    

