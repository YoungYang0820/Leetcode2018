class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        comb(new ArrayList<Integer>(), nums, 0);
        return res;
    }

    private void comb(List<Integer> curList, int[] nums, int index) {
        res.add(new ArrayList<>(curList));
        for (int i = index; i < nums.length; i++) {
            curList.add(nums[i]);
            comb(curList, nums, i + 1);
            curList.remove(curList.size() - 1);
        }
    }
}
