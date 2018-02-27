public class Solution {
    private int[] result;
    public int[] searchRange(int[] nums, int target) {
        result = new int[] {-1, -1};
        binarySearch(nums, 0, nums.length - 1, target);
        return result;
    }
    private void binarySearch(int[] nums, int low, int high, int target) {
        if (low > high) return;
        int mid = (low + high) / 2;
        if (nums[mid] == target) {
            if (mid < result[0] || result[0] == -1) {
                result[0] = mid;
                if (mid > 0 && nums[mid - 1] == target) binarySearch(nums, low, mid - 1, target);
            }
            if (mid > result[1]) {
                result[1] = mid;
                if (mid < nums.length - 1 && nums[mid + 1] == target) binarySearch(nums, mid + 1, high, target);
            }
        }
        else if (nums[mid] > target) {
            binarySearch(nums, low, mid - 1, target);
        }
        else {
            binarySearch(nums, mid + 1, high, target);
        }
    }
}
