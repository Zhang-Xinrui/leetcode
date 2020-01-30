import java.util.HashMap;
import java.util.Map;

public class l1 {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] nums, int target) {
       
       Map<Integer, Integer> numbers = new HashMap<Integer, Integer>();
       for(int i = 0; i < nums.length; i++) {
           numbers.put(nums[i], i);
       }
       for(int i = 0; i < nums.length; i++) {
           int complement = target - nums[i];
           if(numbers.containsKey(complement) && numbers.get(complement) != i) {
               return new int[] {i, numbers.get(target - nums[i])};
           }
       }
       return null;
   }
}