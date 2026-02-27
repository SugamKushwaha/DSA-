class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        int n = intervals.length;
        int[][] result = new int[n + 1][2];

        int j = 0;
        boolean inserted = false;

        // 1️⃣ Insert interval in correct position
        for (int i = 0; i < n; i++) {

            if (!inserted && newInterval[0] < intervals[i][0]) {
                result[j++] = newInterval;
                inserted = true;
            }

            result[j++] = intervals[i];
        }

        // If newInterval is largest
        if (!inserted) {
            result[j++] = newInterval;
        }

        // 2️⃣ Merge part
        ArrayList<int[]> list = new ArrayList<>();

        int s1 = result[0][0];
        int e1 = result[0][1];

        for (int i = 1; i < j; i++) {   // ⚠ use j, not result.length

            int s2 = result[i][0];
            int e2 = result[i][1];

            if (e1 >= s2) {
                e1 = Math.max(e1, e2);
            } else {
                list.add(new int[]{s1, e1});
                s1 = s2;
                e1 = e2;
            }
        }

        list.add(new int[]{s1, e1});

        return list.toArray(new int[list.size()][]);
    }
}