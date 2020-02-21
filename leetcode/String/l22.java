import java.util.List;
import java.util.ArrayList;
class l22 {
    List<String> strings;
    List<Boolean> lists;//true代表左括号，false代表右括号
    int parentheses_count; 
    public List<String> generateParenthesis(int n) {
        strings = new ArrayList<>();
        lists = new ArrayList<>();
        parentheses_count = 0;
        help(n);
        return strings;
    }
    private void help(int n) {
        if(n == parentheses_count) {
            String newstring = new String();
            for(int i = 0; i < lists.size(); i++)
                if(lists.get(i) == true) newstring += '(';
                else newstring += ')';
            for(int i = 0; i < 2 * n - lists.size(); i++)
                newstring += ')';
            strings.add(newstring);
        } else {
            lists.add(true);
            parentheses_count++;
            help(n);
            parentheses_count--;
            lists.remove(lists.size() - 1);
            if(lists.size() != 2 * parentheses_count){
                lists.add(false);
                help(n);
                lists.remove(lists.size() - 1);}
        }
    }
}