import java.util.List;
import java.util.ArrayList;
class l131 {
    List<List<String>> partitionlist;
    public List<List<String>> partition(String s) {
        List<List<Integer>> nextlist = new ArrayList<>();//首先求出以各下标为起始点的所有回文串
        for(int i = 0; i < s.length(); i++)
            nextlist.add(new ArrayList<>());
        for(int i = s.length() - 1; i >= 0; i--) {
            int j = i + 1;
            while(j < s.length()) {
                while(j < s.length() && s.charAt(j) != s.charAt(i)) j++;
                if(j == s.length()) break;
                int left = i + 1, right = j - 1;
                while(right > left && s.charAt(right) == s.charAt(left)){
                    right--; left++;
                }
                if(right <= left) nextlist.get(i).add(j);
                j++;
            }
            nextlist.get(i).add(i);
        }
        partitionlist = new ArrayList<>();
        List<Integer> st = new ArrayList<>(); //扮演一个栈的作用
        st.add(0);
        help(s, nextlist, st);
        return partitionlist;
    }
    private void help(String s, List<List<Integer>> nextlist, List<Integer> st) {
        if(st.get(st.size() - 1) >= s.length()) { //注意，最后一个放入的元素统一是s.length()
            List<String> newlist = new ArrayList<>();
            for(int i = 0; i < st.size() - 1; i++)
                newlist.add(s.substring(st.get(i), st.get(i + 1)));
            partitionlist.add(newlist);
        } else {
            for(int i:nextlist.get(st.get(st.size() - 1)))  {
                st.add(i + 1);
                help(s, nextlist, st);
                st.remove(st.size() - 1);
            }
        }
        return;
    }
}