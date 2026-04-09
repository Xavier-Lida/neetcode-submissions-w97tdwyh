class Solution {
    public int[] twoSum(int[] nums, int target) {
        int pair;
        int[] twoSumArray = new int[2];
        Map<Integer, Integer> twoSumMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            pair = target - nums[i];
            if (twoSumMap.containsKey(pair)){
                twoSumArray[0] = twoSumMap.get(pair);
                twoSumArray[1] = i;
                break;
            }
            twoSumMap.put(nums[i], i);
        }
        return twoSumArray;
    }
}
