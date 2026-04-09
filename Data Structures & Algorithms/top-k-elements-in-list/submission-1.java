class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        List<Integer>[] buckets = new List[n + 1];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList();
        }
        
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : map.keySet()) {
            buckets[map.get(num)].add(num);
        }

        int[] result = new int[k];
        int index = 0;

        for (int i = n; i >= 0 && index < k; i--) {
            for (int num : buckets[i]) {
                result[index++] = num;
            }
            if (index == k) {
                return result;
            }
        }

        return result;
    }
}
