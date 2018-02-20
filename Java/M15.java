class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) return new ArrayList<>();
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int l = nums.length;
        for (int i = 0; i < l; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int j = i + 1, k = l - 1;
                while (j < k) {
                    if (nums[i] + nums[j] == -nums[k]) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        while (j < k && nums[j] == nums[j + 1]) j++;
                        while (j < k && nums[k] == nums[k - 1]) k--;
                        j++;
                        k--;
                    } else if (nums[i] + nums[j] > -nums[k]) {
                        k--;
                    } else {
                        j++;
                    }
                }
            }
        }
        return res;
    }
}
