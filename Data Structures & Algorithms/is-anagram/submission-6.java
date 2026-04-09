class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] sArray = new int[26];
        int[] tArray = new int[26];

        for (char c : s.toCharArray()){
            int index = c - 'a';
            sArray[index] = sArray[index] + 1;
        }

        for (char c : t.toCharArray()){
            int index = c - 'a';
            tArray[index] = tArray[index] + 1;
        }

        // System.out.println(Arrays.toString(sArray));
        // System.out.println(Arrays.toString(tArray));
        return Arrays.equals(sArray, tArray);
    }
}
