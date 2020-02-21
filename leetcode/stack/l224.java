class Solution { //非常笨的递归解法
    public int calculate(String s) {
        //就个加减括号，连乘除都没有，就hard了？
        if(s.length() == 0) return 0;
        int now = 0, result = 0, plus = 1, count, index; // 0表示减，1表示加
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') continue;
            if(s.charAt(i) == '(') {
                index = i; count = 1;
                while(count > 0) {
                    i++;
                    if(s.charAt(i) == '(') count++;
                    else if(s.charAt(i) == ')') count--;
                }
                now = calculate(s.substring(++index, i++));
            }
            if(i < s.length())
                if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                now *= 10; now += s.charAt(i) - '0';
            } else {
                if(plus == 1) result += now;
                else result -= now;
                now = 0;
                if(s.charAt(i) == '+') plus = 1;
                else plus = 0;
            }
        }
       return plus == 1 ?  result + now : result - now;
    }
}