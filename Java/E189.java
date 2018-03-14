class Solution {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0) return;
        int n = nums.length;
        k %= n;
        for (int i = 0; i < (n - k)/2; i++) {
            swap(nums, i, n - k - i - 1);
        }

        for (int i = 0; i < k/2; i++) {
            swap(nums, n - k + i, n - 1 - i);
        }

        for (int i = 0; i < n/2; i++) {
            swap(nums, i, n - 1 - i);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
