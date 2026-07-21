class Solution {
      public boolean sahi(int[] have, int[] need) {
        for (int i = 0; i < 256; i++) {
            if (have[i] < need[i]) {
                return false;
            }
        }
        return true;
    }
    public String minWindow(String s, String t) {
         if (s.length() < t.length()) {
            return "";
        }
        int low = 0;
        int start = 0;
        int res = Integer.MAX_VALUE;
        int len = 0;
        int[] have = new int[256];
        int[] need = new int[256];
        for (int i = 0; i < t.length(); i++) {
            need[t.charAt(i)]++;
        }
        for (int high = 0; high < s.length(); high++) {
            have[s.charAt(high)]++;
            while (sahi(have, need)) {
                int crL = high - low + 1;
                if (res > crL) {
                    res = crL;
                    start = low;
                    len = high + 1;
                }
                have[s.charAt(low)]--;
                low++;
            }
        }
        if (res == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(start, len);
    }
}