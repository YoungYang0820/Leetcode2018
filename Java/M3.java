class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] map = new int[128];
        Arrays.fill(map, -1);
        int max = 0;
        int from = 0;
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i);
            if (map[idx] >= from) {
                from = map[idx] + 1;
            }
            map[idx] = i;
            max = Math.max(max, i - from + 1);
        }
        return max;
    }
}
