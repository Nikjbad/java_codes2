
import java.util.*;

public class HashMapOfMajorityElements {
    public static void majority(int[] nums) {
        HashMap<Integer, Integer> maps = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            if(maps.containsKey(nums[i])) {
                 maps.put(nums[i], maps.get(nums[i]) + 1);
            } else {
                maps.put(nums[i], 1);
            }
        }
        for(int key : maps.keySet()) {
          if (maps.get(key) > n/3 ) {
            System.out.println(key);
          }
        }


    }
    public static void main(String args[]) {
        int[] nums = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        majority(nums);
    }
}

