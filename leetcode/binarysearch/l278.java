public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1, right = n, mid; //左闭右开的经典写法。注意int范围
        while(left < right) {
            mid = left + (right - left) / 2;
            if(isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}