class Solution {
    public int leastInterval(char[] tasks, int n) {
        if (tasks == null || tasks.length == 0) return 0;
        int[] map = new int[26];
        for (char task : tasks) {
            map[task - 'A']++;
        }
        int count = 1;
        int max = 0;
        for (int num : map) {
            if (num == 0) continue;
            if (max < num) {
                max = num;
                count = 1;
            } else if (max == num) {
                count++;
            }
        }
        int res = (n + 1) * (max - 1) + count;
        return Math.max(res, tasks.length);
    }
}
