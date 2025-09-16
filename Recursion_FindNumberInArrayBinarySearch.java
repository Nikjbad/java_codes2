public class Recursion_FindNumberInArrayBinarySearch {
    public static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e-s) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if ( arr[s] < arr[mid]) {
            if ( target >= arr[s] && target <= arr[mid]) {
                return search(arr, target, s, mid -1);
            } else {
                return search(arr, target, mid + 1, e);
            }
        } else {
            if ( target >= arr[mid] && target <= arr[e]) {
                return search(arr, target, mid + 1, e);
            } else {
                return search(arr, target, s, mid - 1);


        }
    }
        
    }
    public static void main(String[] args) {
        int[] arr = {4, 8, 5, 6, 7, 0, 1, 9, 2};
        int target = 9;
        int result = search(arr, target, 0, arr.length - 1);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
        
    }
    
}
