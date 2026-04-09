class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<int[], List<String>> map = new TreeMap<>(Arrays::compare);

        for (String str : strs) {
            int[] freq = new int[26];
            for (char c : str.toCharArray()) {
                freq[c - 'a']++;
            }
            List<String> strList = map.getOrDefault(freq, new LinkedList<String>());
            strList.add(str);
            map.put(freq, strList);
        }

        List<List<String>> result = new LinkedList<List<String>>();
        for (int[] key : map.keySet()) {
            List<String> s = map.get(key);
            result.add(s);
        }
        return result;
    }
}
