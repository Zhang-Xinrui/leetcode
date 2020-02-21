class l43 {
    public String multiply(String num1, String num2) {
        if(num1.charAt(0) == '0' || num2.charAt(0) == '0') return new String("0");
        //两个大正数相乘
        char[] result = new char[num1.length() + num2.length()];
        int num = 0;
        for(int i1 = 0; i1 < num1.length(); i1++) {
            for(int i2 = 0; i2 < num2.length(); i2++) {
                num = (num1.charAt(i1) - '0') * (num2.charAt(i2) - '0');
                result[i1 + i2 + 1] += num % 10;
                result[i1 + i2] += num / 10;
            }
        }
        for(int i = result.length - 1; i > 0; i--) {
            result[i - 1] += result[i] / 10;
            result[i] %= 10;
        }
        for(int i = 0; i < result.length; i++) result[i] += '0';
        if(result[0] > '0')
            return String.valueOf(result);
        return String.valueOf(result).substring(1);
    }
}