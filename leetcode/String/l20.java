import java.util.List;
import java.util.LinkedList;
class l20 {
    public boolean isValid(String s) {
        List<Character> list = new LinkedList<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                list.add(s.charAt(i));
            }else {
                if(list.size() == 0) return false;
                char last = list.remove(list.size() - 1);
                if(s.charAt(i) == ')' && last == '(' || s.charAt(i) == ']' && last == '[' || s.charAt(i) == '}' && last == '{') {
                    continue;
                }
                return false;
            }
        }
        if(list.size() > 0) return false;
        return true;
    }
}