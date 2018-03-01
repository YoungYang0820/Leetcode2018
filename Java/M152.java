public class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int preMaxProduct = nums[0];
        int preMinProduct = nums[0];
        int maxProduct = 0;
        int minProduct = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                maxProduct = Math.max(preMinProduct * nums[i], nums[i]);
                minProduct = Math.min(preMaxProduct * nums[i], nums[i]);
            }
            else {
                maxProduct = Math.max(preMaxProduct * nums[i], nums[i]);
                minProduct = Math.min(preMinProduct * nums[i], nums[i]);
            }
            preMaxProduct = maxProduct;
            preMinProduct = minProduct;
            if (maxProduct > max) max = maxProduct;
        }
        return max;
    }
}
