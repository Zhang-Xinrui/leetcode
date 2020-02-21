import java.lang.Math;
class l372 {
    public int superPow(int a, int[] b) {
        int modnum = 1337;
        int[] mods = new int[b.length];
        mods[b.length - 1] = a % modnum; int temp;
        for(int i = b.length - 2; i >= 0; i--) {
            temp = mods[i + 1];
            for(int j = 0; j < 9; j++)
                temp = (temp * mods[i + 1]) % modnum;
            mods[i] = temp;
        }
        temp = 1;
        for(int i = 0; i < b.length; i++) {
            for(int j = 0; j < b[i]; j++)
                temp = (temp * mods[i]) % modnum;
        }
        return temp;
    }
}