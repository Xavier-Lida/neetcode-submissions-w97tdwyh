class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, String> duplicate = new HashMap<>();

        for(int num : nums){
            if (duplicate.containsKey(num)){
                return true;
            }
            duplicate.put(num, "Yurr");
        }
        return false;  
    }
}