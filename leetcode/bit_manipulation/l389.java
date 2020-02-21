class Solution {
    public char findTheDifference(String s, String t) {
        int[] count = new int[26]; int i = 0;
        for(; i < s.length(); i++) {
            count[s.charAt(i) - 'a']--;
            count[t.charAt(i) - 'a']++;
        }
        count[t.charAt(i) - 'a']++;
        for(i = 0; i < 26; i++) 
            if(count[i] > 0) return (char)('a' + i);
        return 'a';
    }
}