class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sMap = charCounter(s);
        Map<Character, Integer> tMap = charCounter(t);
        return sMap.equals(tMap);
    }

    public static Map<Character, Integer> charCounter(String s) {
        Map<Character, Integer> sMap = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (sMap.containsKey(s.charAt(i))){
                sMap.put(s.charAt(i), sMap.get(s.charAt(i))+1);
            } else {
                sMap.put(s.charAt(i), 0);
            }
        }
        return sMap;
    }
}
