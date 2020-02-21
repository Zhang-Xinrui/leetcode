class l132 {//这个问题应该有更好的解法
    public int minCut(String s) {
        int[] numcut = new int[s.length()];
        numcut[s.length() - 1] = 0;
        for(int i = s.length() - 2; i >= 0; i--) {
            int j = i + 1, mincutnum = 1 + numcut[i + 1];
            while(j < s.length()){
                while(j < s.length() && s.charAt(i) != s.charAt(j)) j++;
                if(j == s.length()) break;
                int left = i + 1, right = j - 1;
                while(right > left && s.charAt(right) == s.charAt(left)) {right--; left++;}
                if(right <= left) 
                    if(j + 1 == s.length()) 
                        mincutnum = 0;
                    else
                        mincutnum = Math.min(mincutnum, 1 + numcut[j + 1]); 
                j++;
            }
            numcut[i] = mincutnum;
        }
        return numcut[0];
    }
}