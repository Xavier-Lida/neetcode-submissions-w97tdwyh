class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet();
        Map<Character, Integer> map = new HashMap();
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (set.contains(c)) {
                set.clear();
                i = map.get(c);
                continue;
            }

            set.add(c);
            map.put(c, i);
            max = Math.max(max, set.size());
        }

        return max;
    }
}
