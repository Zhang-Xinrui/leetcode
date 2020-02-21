class l38 {
    public String countAndSay(int n) {
        switch(n) {
            case 1: return new String("1");
            case 2: return new String("11");
            case 3: return new String("21");
            case 4: return new String("1211");
        }
        String lastone = countAndSay(n - 1);
        String newone = new String();
        int count = 0, i = 0;
        for(; i < lastone.length(); i++) {
            if(count == 0 || lastone.charAt(i - 1) == lastone.charAt(i)) 
                count++;
            else {
                newone += Integer.toString(count);
                newone += lastone.charAt(i - 1);
                count = 1;
            }
        }
        if(count > 0) {
            newone += Integer.toString(count);
            newone += lastone.charAt(i - 1);
        }
        return newone;
    }
}