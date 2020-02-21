class Solution {
    public boolean validUtf8(int[] data) {
        int next = 0, now;
        for(int i : data) {
            i %= 256;
            if(next == 0) {
                if(i < 128) continue;
                else if(i < 192 || i >= 248) return false;
                else if(i < 224) next = 1;
                else if(i < 240) next = 2;
                else  next = 3;
            } else {
                if(i >= 128 && i < 192) next--;
                else return false;
            }
        }
        if(next > 0) return false;
        return true;
    }
}