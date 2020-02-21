class l397 {
    public int integerReplacement(int n) {
        int count = 0;
        long num = n;
        while(num != 1) {
            count++;
            if(num % 2 == 0) num /= 2;
            else if(num - 1 == 2 || (num - 1) % 4 == 0) num--;
            else num++;
        }
        return count;
    }
}