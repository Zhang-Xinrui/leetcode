class l400 { //大致一个思路，未能AC，纯粹数学的思维题目
    public int findNthDigit(int n) {
        int digits = 1, next = 9;
        while(n > next) {
            digits++; 
            n -= next;
            if(digits == 10) break;
            next = next * 10 * digits / (digits - 1);
        }
        int count = n / digits;
        int index = digits - 1 - n % digits;
        int num = digits == 1 ? count : (int)Math.pow(10, digits - 1) + count;
        for(int i = 0; i < index; i++)
            num /= 10;
        return num % 10;
    }
}