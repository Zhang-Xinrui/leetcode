class l387 {
    public int firstUniqChar(String s) {
        int[] nums = new int[26]; int index;
        for(int i = 0; i < s.length(); i++) {
            index = s.charAt(i) - 'a';
            if(nums[index] == 0) {
                nums[index] = i + 1; 
            } else if(nums[index] > 0)
                nums[index] = -1;
        }
        index = s.length();
        for(int i = 0; i < 26; i++) {
            if(nums[i] > 0)
                index = Math.min(index, nums[i] - 1);
        }
        if(index == s.length()) return -1;
        return index;
    }
}