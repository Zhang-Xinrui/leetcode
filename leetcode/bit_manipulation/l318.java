class Solution {
    public int maxProduct(String[] words) {
        int[] represent = new int[words.length]; int max = 0;
        for(int i = 0; i < words.length; i++) {
            for(char s : words[i].toCharArray())
                represent[i] |= 1 << (s - 'a');
            for(int j = 0; j < i; j++)
                if((represent[i] & represent[j]) == 0)
                    max = Math.max(words[i].length() * words[j].length(), max);
        }
        return max;
    }
}