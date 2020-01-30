import java.util.HashMap;
import java.util.Map;
class l169 {
    public int majorityElement(final int[] nums) {
        int n = nums.length / 2, i;
        Map<Integer, Integer> map = new HashMap<>();
        for(i = 0; i < nums.length - n; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for( ; i < nums.length && map.entrySet().size() != 1; i++) {
            if(map.containsKey(nums[i])) {
                if(map.get(nums[i]) + nums.length - i > n) {
                    map.put(nums[i], map.get(nums[i]) + 1);
                } else {
                    map.remove(nums[i]);
                }
            }
        }
        if(map.keySet().size() == 1)
            return map.keySet().iterator().next();
        else { 
             n = 0;
            for(int k : map.keySet()) {
                if(map.get(k) > n) {
                    i = k;
                    n = map.get(k);
                }
            }
            return i;
        }
  /*      Iterator<Map.Entry<Integer, Integer>> entries = map.entrySet().iterator();
        while(entries.hasNext()) {
            Map.Entry<Integer, Integer> entry = entries.next();
            if(entry.getValue() > n) {
                return entry.getKey();
            }
        } 
       //注意：通过键找值是耗时的操作，不推荐使用
        return 0;*/
    }
}