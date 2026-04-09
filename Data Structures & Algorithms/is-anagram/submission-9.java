class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        if (n != t.length()) {
            return false;
        }

        int[] res = new int[26];

        for (int i = 0; i < n; i++) {
            res[s.charAt(i) - 'a']++;
            res[t.charAt(i) - 'a']--;
        }

        for (int i : res) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }
}
