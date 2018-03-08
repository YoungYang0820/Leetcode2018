class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int n = nums.length;
        if (n < 2) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);
        if (n == 3) return Math.max(nums[0], Math.max(nums[1], nums[2]));
        int[] dp1 = new int[n + 1];
        int[] dp2 = new int[n + 1];
        dp1[n] = 0;
        dp1[n - 1] = nums[n - 1];
        dp2[n] = 0;
        dp2[n - 1] = 0;
        for (int i = n - 2; i > 0; i--) {
            dp1[i] = Math.max(nums[i] + dp1[i + 2], dp1[i + 1]);
            dp2[i] = Math.max(nums[i] + dp2[i + 2], dp2[i + 1]);
        }
        return Math.max(Math.max(dp1[2], dp1[1]), Math.max(nums[0] + dp2[2], dp2[1]));
    }
}
