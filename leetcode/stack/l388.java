class Solution {
    public int lengthLongestPath(String input) {
        Stack<Integer> stack = new Stack<>(); //记录各个文件或文件夹名称长度
        int stacksize = 0, nowlen = 0, maxlen = 0, nowsize, index;
        for(String s : input.split("\n")) {
            nowsize = 0;
            for(index = 0; index < s.length(); index++)
                if(s.charAt(index) == '\t') nowsize++;
                else break;
            while(nowsize < stacksize) {
                stacksize--; nowlen -= stack.pop();
                if(nowlen > 0) nowlen--;
            }
            stack.add(s.length() - index); stacksize++;
            if(nowlen > 0) nowlen++;
            nowlen += s.length() - index;
            if(s.contains(".") && nowlen > maxlen) {
                maxlen = nowlen;
            }
        }
        return maxlen;
    }
}