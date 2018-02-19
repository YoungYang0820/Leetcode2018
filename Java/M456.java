class Solution {
    public boolean find132pattern(int[] nums) {
        int third = Integer.MIN_VALUE;
        Stack<Integer> s = new Stack<>();
        for(int i = nums.length - 1; i >= 0; i-- ){
            if(nums[i] < third) return true;
            else {
                while(!s.empty() && nums[i] > s.peek() ){
                  third = s.pop();
                }
            }
            s.push(nums[i]);
        }
        return false;
    }
}
