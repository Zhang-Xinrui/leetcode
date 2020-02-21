public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1, high = n, mid;
        while(low < high) {
            mid = low + (high - low) / 2;
            if(guess(mid) == 1) low = mid + 1;
            else if(guess(mid) == -1) high = mid;
            else return mid;
        }
        return low;
    }
}