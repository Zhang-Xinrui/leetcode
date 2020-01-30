import java.util.HashMap;
import java.util.Map;

public class l1quick {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < numbers.length; i++) {
            if(map.containsKey(numbers[i])) {
                return new int[] {map.get(numbers[i]), i + 1};
            }
            map.put(target - numbers[i], i + 1);
        }
        return null;
    } 
}