import java.util.HashMap;
import java.util.Map;

class l3 {//字符种类有限，使用Map不能发挥其性能优势。可以使用数组来代替，有极高性能，l3best.java
    
    public int lengthOfLongestSubstring(String s) {
        int max_length = 0, min_location = 0; //使用位置判断最后的一个子串长度 
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) >= min_location) {
                if(i - min_location > max_length) {
                    max_length = i - min_location;
                }
                min_location = map.get(s.charAt(i)) + 1;
            } 
            map.put(s.charAt(i), i);
        }
        if(s.length() - min_location > max_length) {
            return s.length() - min_location;
        } else
            return max_length;
    }
}