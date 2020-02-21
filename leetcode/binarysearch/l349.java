import java.util.Set;
import java.util.HashSet;
class l349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> num1set = new HashSet<>();
        Set<Integer> interset = new HashSet<>();
        for(int i = 0; i < nums1.length; i++)
            num1set.add(nums1[i]);
        for(int i = 0; i < nums2.length; i++)
            if(num1set.contains(nums2[i])) {
                interset.add(nums2[i]);
            }
        int[] result = new int[interset.size()]; int i = 0;
        for(int num : interset) {
            result[i++] = num;
        }
        return result;
    }
}