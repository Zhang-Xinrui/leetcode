import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
class l350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        int resultlen = 0, temp;
        Map<Integer, Integer> nums1map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++) {
            if(nums1map.containsKey(nums1[i]))
                nums1map.put(nums1[i], nums1map.get(nums1[i]) + 1);
            else
                nums1map.put(nums1[i], 1);
        }
        for(int i = 0; i < nums2.length; i++) {
            if(nums1map.containsKey(nums2[i])) {
                temp = nums1map.get(nums2[i]) - 1; resultlen++;
                if(temp == 0) {
                    nums1map.remove(nums2[i]);
                } else {
                    nums1map.put(nums2[i], temp);
                }
                list.add(nums2[i]);
            }
        } 
        int[] result = new int[resultlen]; int index = 0;
        for(int key: list) {
            for(int i = 0; i < list.size(); i++)
                result[index++] = key;
        }
        return result;
    }
}