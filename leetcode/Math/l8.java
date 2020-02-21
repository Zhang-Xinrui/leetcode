class l8 {
    public int myAtoi(String str) {
        int index = 0;
        while(index < str.length() && str.charAt(index) == ' ') index++;
        if(index >= str.length()) return 0;
        int signed = 0; long number = 0;
        if(str.charAt(index) == '-') {
            signed = 1; 
            index++;
        } else if(str.charAt(index) == '+') 
            index++;
        while(index < str.length() && str.charAt(index) >= '0' && str.charAt(index) <='9'){
            number *= 10; number += str.charAt(index) - '0';
            index++;
            if(signed == 0 && number >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(signed == 1 && -number <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }
        if(signed == 0) return (int)number;
        return -(int)number;
    }
}