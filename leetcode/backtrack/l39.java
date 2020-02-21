class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> combinationSum(int[] candidates, int target)     {   Arrays.sort(candidates);
        result = new ArrayList<>();
        List<Integer> nowlist = new ArrayList<>();
        help(candidates, 0, target, nowlist);
        return result;                                                      
    }
    private void help(int[] candidates, int index, int target, List<Integer> nowlist) {
        if(target == 0){
            result.add(nowlist);
            return;
        }
        if(index >= candidates.length || candidates[index] > target)
            return;
        List<Integer> newlist = new ArrayList<>(nowlist);
        newlist.add(candidates[index]);
        help(candidates, index, target - candidates[index], newlist);
        help(candidates, ++index, target, nowlist);
        return;
    }
}