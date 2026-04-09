class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        if (n != t.length()) {
            return false;
        }

        int[] sArray = new int[26];
        int[] tArray = new int[26];

        char[] sLetters = s.toCharArray();
        char[] tLetters = t.toCharArray();

        for (int i = 0; i < n; i++) {
            sArray[sLetters[i] - 'a']++;
            tArray[tLetters[i] - 'a']++;
        }

        return Arrays.equals(sArray, tArray);
    }
}
