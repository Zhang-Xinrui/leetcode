class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> combine(int n, int k) {
        result = new ArrayList<>();
        List<Integer> nowlist = new ArrayList<>();
        help(1, n, k, nowlist);
        return result;
    }
    private void help(int low, int n, int k, List<Integer> nowlist) {
        if(n - low + 1 == k || k == 0) {
            if(k != 0) {
                for(int i = low; i <= n; i++)
                    nowlist.add(i);
            }
            result.add(nowlist);
        } else {
            List<Integer> newlist = new ArrayList<>(nowlist);
            newlist.add(low);
            help(++low, n, k, nowlist);
            help(low, n, --k, newlist);
        }
        return;
    }
}