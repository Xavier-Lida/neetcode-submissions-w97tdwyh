class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        List<Integer> zero = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num == 0) {
                zero.add(i);
                continue;
            }
            product *= num;
        }

        int[] result = new int[nums.length];
        
        if (zero.size() >= 2) {
            return result;
        }

        if (zero.size() == 1) {
            result[zero.getFirst()] = product;
            return result;
        }

        for (int i = 0; i < nums.length; i++) {
            result[i] = product / nums[i];
        }

        return result;
    }
}  
