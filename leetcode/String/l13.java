class l13 {
    public int romanToInt(String s) {
        int number = 0;
        for(int i = 0; i < s.length(); i++) {
            if(i + 1 < s.length() && !compare(s.charAt(i), s.charAt(i + 1)))
                number -= value(s.charAt(i));
            else{
                number += value(s.charAt(i));
            }
        }
        return number;
    }
    boolean compare(char ch1, char ch2) { //用以排除特例结构
        if(ch1 == 'I' && (ch2 == 'V' || ch2 == 'X')) return false;
        if(ch1 == 'X' && (ch2 == 'L' || ch2 == 'C')) return false;
        if(ch1 == 'C' && (ch2 == 'D' || ch2 == 'M')) return false;
        return true;
    }
    int value(char ch) {
        switch(ch) {
            case 'M' : return 1000;
            case 'D' : return 500;
            case 'C' : return 100;
            case 'L' : return 50;
            case 'X' : return 10;
            case 'V' : return 5;
            case 'I' : return 1;
        }
    }
}