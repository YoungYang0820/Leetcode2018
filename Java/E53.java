class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int len = nums.length;
        int max = nums[0];
        int acc = nums[0];
        for (int i = 1; i < len; i++) {
            acc = Math.max(acc, 0) + nums[i];
            max = Math.max(max, acc);
        }
        return max;
    }
}
