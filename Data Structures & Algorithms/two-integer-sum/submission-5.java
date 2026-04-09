class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsSeen = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];

            if(numsSeen.containsKey(diff)){
                return new int[] { numsSeen.get(diff), i };
            }

            numsSeen.put(nums[i], i);
        }
        return null;
    }
}
