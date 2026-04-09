class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hashMap = new HashMap<String, List<String>>();

        for (String str : strs) {
            char[] word = str.toCharArray();
            int[] englishLettersCount = new int[26];
            for (char c : word) {
                englishLettersCount[c - 'a']++;
            }
            String key = Arrays.toString(englishLettersCount);
            hashMap.putIfAbsent(key, new ArrayList<String>());
            hashMap.get(key).add(str);
        }

        return new ArrayList<List<String>>(hashMap.values());
    }
}
