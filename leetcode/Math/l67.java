class l67 {
    public String addBinary(String a, String b) {
        int ai = a.length() - 1, bi = b.length() - 1, count = 0;
        char[] sum = new char[Math.max(a.length(), b.length())];
        int sumi = sum.length - 1;
        while(ai >= 0 || bi >= 0) {
            if(ai >= 0) count += a.charAt(ai) - '0';
            if(bi >= 0) count += b.charAt(bi) - '0';
            if(count % 2 == 0) sum[sumi--] = '0';
            else sum[sumi--] = '1';
            if(count > 1) count = 1; 
            else count = 0;
            ai--; bi--;
        }
        if(count > 0) return "1" + String.valueOf(sum);
        return String.valueOf(sum);
        
    }
}