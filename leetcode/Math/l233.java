class l233 { //这道题考察的知识点纯属数学
    public int countDigitOne(int n) {
        if(n <= 0) return 0;
        int answer = 0, q = n, x = 1;
        do{
            int digit = q % 10;
            q /= 10;
            answer += q * x;
            if(digit == 1) answer += 1 + n % x;
            if(digit > 1) answer += x;
            x *= 10;
        } while(q > 0);
        return answer;
    }
}