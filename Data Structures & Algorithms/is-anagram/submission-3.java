class Solution {
    public boolean isAnagram(String s, String t) {
        return freq(s).equals(freq(t));
        }
    
    public static String freq(String str){
        char[] charArray = str.toCharArray();
        int[] charFreq = new int[26];
        for(char c : charArray){
            charFreq[c - 'a']++;
        }
        return Arrays.toString(charFreq);
    }
}
