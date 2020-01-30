class l299 {    //感觉这道题没什么意思，这是用一个数组的写法，两个数组更易理解。不太明白Leetcode怎么算的运行时间
    public String getHint(String secret, String guess) {
        int[] count_array = new int[10];
        int bull_count = 0, cow_count = 0;
        for(int i = 0; i < secret.length(); i++) {
            if(secret.charAt(i) == guess.charAt(i)) {
                bull_count++;
            } else {
                if(count_array[secret.charAt(i) - '0']-- > 0) {
                    cow_count++;
                }
                if(count_array[guess.charAt(i) - '0']++ < 0) {
                    cow_count++;
                }
            }
        }
        return bull_count + "A" + cow_count + "B";
    }
}