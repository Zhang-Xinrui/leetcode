class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> combinationSum3(int k, int n) {
        result = new ArrayList<>();
        List<Integer> nowlist = new ArrayList<>();
        help(k, n, 1, nowlist);
        return result;
    }
    private void help(int k, int n, int num, List<Integer> nowlist) {
        if(n == 0){
            result.add(nowlist);
            return;
        }
        if(k == 0 || num > 9 || (k * num + k * (k - 1) / 2 > n)) {
            return;
        }
        List<Integer> newlist = new ArrayList<>(nowlist);
        newlist.add(num);
        help(--k, n - num, num + 1, newlist);
        help(++k, n, ++num, nowlist);
        return;
    }
}