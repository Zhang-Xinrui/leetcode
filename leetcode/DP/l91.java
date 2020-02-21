class Solution {
    public int numDecodings(String s) {
        if(s.length() == 0 || s.charAt(0) == '0') return 0;
        if(s.length() == 1) 
            return 1;
        int n1 = 1, n2 = 1, index = 1, temp;
        while(index < s.length()) {
            temp = 0;
            if(s.charAt(index - 1) == '1' || s.charAt(index - 1) == '2' && s.charAt(index) <= '6')
                temp += n1;
            if(s.charAt(index) != '0') temp += n2;
            n1 = n2; n2 = temp; index++;
        }
        return n2;
    }
}