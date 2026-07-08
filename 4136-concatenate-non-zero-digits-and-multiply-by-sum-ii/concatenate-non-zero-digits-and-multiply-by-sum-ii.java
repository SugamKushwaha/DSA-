class Solution {
    static final long MOD = 1_000_000_007L;

    public int[] sumAndMultiply(String s, int[][] q) {
        int n = s.length();

        long[] sumPref = new long[n + 1];

        List<Integer> pos = new ArrayList<>();
        List<Integer> dig = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int d = s.charAt(i) - '0';

            sumPref[i + 1] = sumPref[i];
            if (d != 0) {
                sumPref[i + 1] += d;
                pos.add(i);
                dig.add(d);
            }
        }

        int m = dig.size();

        long[] pow10 = new long[m + 1];
        long[] pref = new long[m + 1];

        pow10[0] = 1;

        for (int i = 0; i < m; i++) {
            pow10[i + 1] = (pow10[i] * 10) % MOD;
            pref[i + 1] = (pref[i] * 10 + dig.get(i)) % MOD;
        }

        int[] ans = new int[q.length];

        for (int i = 0; i < q.length; i++) {
            int l = q[i][0];
            int r = q[i][1];

            long sum = sumPref[r + 1] - sumPref[l];

            int left = lowerBound(pos, l);
            int right = upperBound(pos, r);

            long x = 0;

            if (left < right) {
                int len = right - left;

                x = (pref[right]
                        - pref[left] * pow10[len] % MOD
                        + MOD) % MOD;
            }

            ans[i] = (int) ((x * (sum % MOD)) % MOD);
        }

        return ans;
    }

    private int lowerBound(List<Integer> a, int target) {
        int l = 0, r = a.size();
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < target) l = m + 1;
            else r = m;
        }
        return l;
    }

    private int upperBound(List<Integer> a, int target) {
        int l = 0, r = a.size();
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) <= target) l = m + 1;
            else r = m;
        }
        return l;
    }
}