class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if ("([{".indexOf(c) != -1) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char openC = stack.pop();
                if (openC == '(' && c != ')') {
                    return false;
                } else if (openC == '[' && c != ']') {
                    return false;
                } else if ( openC == '{' && c != '}') {
                    return false;
                }
            }
        }

        if (!stack.isEmpty()) return false;
        return true;
    }
}
