class l14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        int common_length = strs[0].length();
        for(int i = 1; i < strs.length; i++) {
            while(!strs[i].startsWith(strs[i - 1].substring(0, common_length)))
                common_length--;
        }
        return strs[0].substring(0, common_length);
    }
}