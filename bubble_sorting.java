public class bubble_sorting {
    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }
        System.out.println();
        
    }
    public static void main(String args[]){
        int arr[] = {5,2,9,6,2,8};
        //count
        for (int i = 0; i <= arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    //swaping
                    int a = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = a;

                }
                
            }
            
        }
        printarr(arr);

    }
    
}
