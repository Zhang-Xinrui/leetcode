import java.util.List;
import java.util.ArrayList;
class l45 {
    public int jump(int[] nums) {
        if(nums.length <= 2) return nums.length - 1;
        List<Integer> list = new ArrayList<>();
        list.add(nums.length - 1);
        for(int i = nums.length - 2; i >= 0; i--) {
            if(i + nums[i] < list.get(list.size() - 1)) {
                if(i + 1 < list.get(list.size() - 1) && i + 1 + nums[i + 1] >= list.get(list.size() - 1))
                    list.add(i + 1);
            } else if(list.size() > 1 && i + nums[i] >= list.get(list.size() - 2)) {
                list.remove(list.size() - 1); i++;
            } 
        }
        return list.size();
    }
}