class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        return combinationSum(candidates, target, 0);
    }
    private List<List<Integer>> combinationSum(int[] candidates, int target, int start) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] < target) {
                for (List<Integer> a : combinationSum(candidates, target - candidates[i], i)) {
                    a.add(0, candidates[i]);
                    res.add(a);
                }
            } else if (candidates[i] == target) {
                List<Integer> tmp = new ArrayList<>();
                tmp.add(candidates[i]);
                res.add(tmp);
            } else {
                break;
            }
        }
        return res;
    }
}
