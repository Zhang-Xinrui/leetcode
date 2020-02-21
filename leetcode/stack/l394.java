class Solution {
    public String decodeString(String s) {
        String result = new String(); String newone; int repeatnum;
        int index = 0, count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                result += s.substring(index, i); repeatnum = 0;
                while(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    repeatnum *= 10; repeatnum += s.charAt(i) - '0'; i++;
                }
                index = i; count = 1;
                while(count > 0) {
                    i++;
                    if(s.charAt(i) == '[') count++;
                    else if(s.charAt(i) == ']') count--;
                }
                newone = decodeString(s.substring(++index, i)); index = i + 1;
                for(int j = 0; j < repeatnum; j++) result += newone;
            }
        }
        return result +  s.substring(index, s.length());
    }
}