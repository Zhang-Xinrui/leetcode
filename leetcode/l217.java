import java.util.HashSet;
import java.util.Set;
class l217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(!numbers.add(nums[i]))
                return true;
        }
        return false;
    }
}