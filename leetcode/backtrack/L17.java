import java.util.List;
import java.util.ArrayList;
class Solution {
    List<String> result;
    List<List<Character>> maptable;
    public List<String> letterCombinations(String digits) {
        result = new ArrayList<>();
        if(digits.equals("")) return result;
        maptable = new ArrayList<>();
        List<Character> list;
        char now = 'a';
        for(int i = 2; i < 10; i++) {
            list = new ArrayList<>();
            int j;
            if(i == 7 || i == 9) j = 4;
            else j = 3;
            for(int k = 0; k < j; k++) list.add(now++);
            maptable.add(list);
        }
        help(digits, 0, new String());
        return result;
    } 
    private void help(String digits, int index, String now) {
        if(index >= digits.length()) {result.add(now); return;}
        int listindex = digits.charAt(index) - '2';
        List<Character> nowlist = maptable.get(listindex);
        for(int i = 0; i < nowlist.size(); i++) {
            String newone = now + nowlist.get(i);
            help(digits, index + 1, newone);
        }
        return;
    }
}