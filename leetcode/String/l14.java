class l14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        int common_length = strs[0].length();
        for(int i = 1; i < strs.length; ) {
            if(strs[i].length() < common_length) {
                common_length = strs[i].length();
            } else if(strs[i].substring(0, common_length).equals(strs[i - 1].substring(0, common_length))) {
                i++;
            } else {
                common_length--;
            }
            if(common_length == 0) return "";
        }
        return strs[0].substring(0, common_length);
    }
}