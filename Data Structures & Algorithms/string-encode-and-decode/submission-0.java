class Solution {

    public String encode(List<String> strs) {
        if (strs == null) return null;
        StringBuilder secret = new StringBuilder();

        for (String s : strs) {
            secret.append(s.length()).append("#").append(s);
        }
        return secret.toString();
    }

    public List<String> decode(String str) {
        if (str == null) return new ArrayList();
        List<String> result = new ArrayList();
        int i = 0;
        while (i < str.length()) {
            int sharpIndex = str.indexOf('#', i);
            int length = Integer.valueOf(str.substring(i, sharpIndex));
            i = sharpIndex + 1;
            
            String s = str.substring(i, i + length);
            result.add(s);
            i += length;
        }
        return result;
    }
}