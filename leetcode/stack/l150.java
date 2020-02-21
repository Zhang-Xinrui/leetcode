class Solution {
    public int evalRPN(String[] tokens) {
        int num1, num2;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < tokens.length; i++) {
            if(tokens[i].length() > 1 || tokens[i].charAt(0) > '0' && tokens[i].charAt(0) <= '9') {
                int j = tokens[i].charAt(0) == '-' ? 1 : 0;
                num1 = 0;
                for(; j < tokens[i].length(); j++) {
                    num1 *= 10; num1 += tokens[i].charAt(j) - '0';
                }
                if(tokens[i].charAt(0) == '-') stack.add(-num1);
                else stack.add(num1);
            } else { num2 = stack.pop(); num1 = stack.pop();
            if(tokens[i].equals("+")) {
                 stack.add(num1+num2);
            } else if(tokens[i].equals("-")) {
                stack.add(num1-num2);
            } else if(tokens[i].equals("*")) {
                stack.add(num1*num2);
            } else  {
                stack.add(num1/num2);
            }
            }
        }
        return stack.pop();
    }
}