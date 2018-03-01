class Solution {
    public int countPrimes(int n) {
        if (n < 3) return 0;
        boolean[] mem = new boolean[n];
        Arrays.fill(mem, false);
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!mem[i]) {
                count++;
                for (int j = 1; i * j < n; j++) {
                    mem[i * j] = true;
                }
            }
        }
        return count;
    }
}
