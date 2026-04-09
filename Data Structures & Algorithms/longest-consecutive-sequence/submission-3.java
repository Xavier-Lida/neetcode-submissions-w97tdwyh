class Solution {
    public int longestConsecutive(int[] nums) {
       Set<Integer> set = new HashSet<Integer>();
        for (Integer num : nums) {
            set.add(num);
        }

       int longest = 0;

       for (Integer num : nums) {
            if (set.contains(num - 1)) {
                continue;
            }

            int current = 0;
            int n = num;

            while (set.contains(n)) {
                n++;
                current++;
            }

            longest = Math.max(current, longest);
       }
       return longest;
    }
}
