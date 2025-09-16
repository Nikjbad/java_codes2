public class recursion_check_strictly_increasing {
    public static boolean increasing(int arr[], int idx){
        if (idx == arr.length-1){
            return true;
        }
        if (arr[idx] < arr[idx+1]){
           return increasing(arr, idx+1);

        } else {
            return false;
        }
    }
    public static void main(String[] args) {
       int arr [] = {1,2,3,4};
       System.out.println(increasing(arr, 0));
    }
}
