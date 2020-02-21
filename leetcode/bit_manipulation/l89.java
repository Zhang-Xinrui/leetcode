class Solution {
    public List<Integer> grayCode(int n) { //找规律
        List<Integer> list = new ArrayList<>();
        int addition, temp; list.add(0);
        for(int i = 1; i < Math.pow(2, n); i++) {
            addition = 1; temp = i;
            while(temp % 2 == 0) {
                addition <<= 1; temp /= 2;
            }
            list.add(list.get(list.size() - 1) ^ addition);
        }
        return list;
    }
}