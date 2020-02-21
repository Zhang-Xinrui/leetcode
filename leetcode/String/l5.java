import java.util.Set;
import java.util.HashSet;
class l5 {
    public String longestPalindrome(String s) {
        //思路很简单：只要能够找出所有长度为2的回文串和长度为3的回文串，则可轻易判断更长的回文串
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        int left, right, leftmax = 0, rightmax = 0;//用以保存当前最长的回文串
        int max1 = 1;
        for(int i = 0; i < s.length() - 1; i++) 
            if(s.charAt(i + 1) == s.charAt(i))
                set1.add(i);
        if(set1.size() != 0) {
            for(int i : set1) {
                left = i - 1; right = i + 2;
                while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {left--;right++;}
                if(right - left - 1 > max1) {max1 = right - left - 1;  leftmax = left + 1; rightmax = right - 1;}
            } 
        }
        for(int i = 0; i < s.length() - 2; i++)
            if(s.charAt(i + 2) == s.charAt(i))
                set2.add(i);
        if(set2.size() != 0) {
            for(int i : set2) {
                left = i - 1; right = i + 3;
                while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {left--; right++;}
                if(right - left - 1 > max1) {max1 = right - left - 1; leftmax = left + 1; rightmax = right - 1;}
            }
        }
        return s.substring(leftmax, rightmax + 1);
    }
}