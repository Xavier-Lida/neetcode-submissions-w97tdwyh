class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int max = 0;
        Map<Character, Integer> lastIndex = new HashMap();
        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            if (lastIndex.containsKey(c)) {
                l = Math.max(l, lastIndex.get(c) + 1);
            }
            lastIndex.put(c, r);
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}
