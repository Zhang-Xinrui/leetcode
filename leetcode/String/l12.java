class l12 {
    public String intToRoman(int num) {
        String number = new String();
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for(int i = 0; i < values.length; i++) {
            while(num >= values[i]) {
                num -= values[i];
                number += symbols[i];
            }
        }
        return number;
    }
}