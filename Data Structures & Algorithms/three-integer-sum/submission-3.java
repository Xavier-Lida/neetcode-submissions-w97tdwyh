class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int num = nums[i];
            int start = i + 1;
            int end = nums.length - 1;

            while (start < end) {
                int sum = num + nums[start] + nums[end];
                if (sum == 0) {
                    List element = List.of(nums[i], nums[start], nums[end]);
                    if (!res.contains(element)) {
                        res.add(element);
                    }
                    start++;
                } else if (sum > 0) {
                    end--;
                } else {
                    start++;
                }
            } 
        }

        return res;
    }
}
