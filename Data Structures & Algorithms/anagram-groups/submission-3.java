class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap();

        for (String word : strs) {
            int[] array = new int[26];
            char[] letters = word.toCharArray();
            for (char c : letters) {
                array[c - 'a'] += 1;
            }
            String key = Arrays.toString(array);
            result.putIfAbsent(key, new ArrayList());
            result.get(key).add(word);
        }

        return new ArrayList(result.values());
    }
}
