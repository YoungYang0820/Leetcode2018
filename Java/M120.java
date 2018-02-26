public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int depth = triangle.size();
        for (int i = depth - 2; i >= 0; i--) {
            List<Integer> row = triangle.get(i);
            for (int j = 0; j < row.size(); j++) {
                row.set(j, row.get(j) + Math.min(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1)));
            }
        }
        return triangle.get(0).get(0);
    }
}
