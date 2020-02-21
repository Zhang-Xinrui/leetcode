import java.util.Map;
import java.util.HashMap;
class l290 {
    public boolean wordPattern(String pattern, String str) {
        Map<Character, String> map = new HashMap<>();
        int str_index1, str_index2 = 0;
        for(int i = 0; i < pattern.length(); i++) {
            if(str_index2 < str.length() && str.charAt(str_index2) == ' ') str_index2++;
            str_index1 = str_index2;
            while(str_index2 < str.length() && str.charAt(str_index2) != ' ') str_index2++;
            if(str_index1 == str_index2) return false;

            if(map.containsKey(pattern.charAt(i))) {
                if(!map.get(pattern.charAt(i)).equals(str.substring(str_index1, str_index2)))
                    return false;
            } else {
                if(map.values().contains(str.substring(str_index1, str_index2))) {
                    return false;
                }
                map.put(pattern.charAt(i), str.substring(str_index1, str_index2));
            }
        }
        if(str_index2 == str.length()) return true;
        return false;
    }
}