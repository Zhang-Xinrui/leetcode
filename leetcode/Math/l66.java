class l66 {
    public int[] plusOne(int[] digits) {
        int right = digits.length - 1;
        while(right >= 0 && digits[right] == 9) {digits[right] = 0; right--;}
        if(right < 0) {
            int[] newdigits = new int[digits.length + 1];
            newdigits[0] = 1;
            for(int i = 0; i < digits.length; i++)
                newdigits[i + 1] = digits[i];
            return newdigits;
        }
        digits[right]++;
        return digits;
    }
}