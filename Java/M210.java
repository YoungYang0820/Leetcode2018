class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList[] pres = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            pres[i] = new ArrayList<>();
        }
        int[] preCount = new int[numCourses];
        int[] res = new int[numCourses];
        for (int[] pre : prerequisites) {
            preCount[pre[0]]++;
            pres[pre[1]].add(pre[0]);
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (preCount[i] == 0) {
                q.add(i);
            }
        }
        int index = 0;
        while (!q.isEmpty()) {
            int course = q.poll();
            res[index++] = course;
            ArrayList<Integer> courseList = pres[course];
            for (int c : courseList) {
                preCount[c]--;
                if (preCount[c] == 0) {
                    q.add(c);
                }
            }
        }
        return (index == numCourses) ? res : new int[0];
    }
}
