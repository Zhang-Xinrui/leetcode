class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        result = new ArrayList<>();
        List<Integer> nowlist = new ArrayList<>();
        Arrays.sort(candidates);
        help(candidates, target, 0, nowlist);
        return result;
    }
    private void help(int[] candidates, int target, int index, List<Integer> nowlist) {
        if(target == 0) {
            result.add(nowlist); return;
        }
        if(index >= candidates.length || target < candidates[index]) 
            return;
        int num = candidates[index];
        List<Integer> newlist = new ArrayList<>(nowlist);
        newlist.add(candidates[index]);
        help(candidates, target - candidates[index], ++index, newlist);
        while(index < candidates.length && candidates[index] == num)
            index++;
        help(candidates, target, index, nowlist);
        return;
    }
}