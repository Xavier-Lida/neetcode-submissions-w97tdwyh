class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int m = (r + l) / 2;
            if (nums[m] > nums[r]) {
                l = m + 1;
            } else {
                r = m;
            }
        }

        int pivot = l;
        int res = binarySearch(nums, target, 0, pivot - 1);
        if (res != -1) return res;

        return binarySearch(nums, target, pivot, nums.length - 1);
    }

    private int binarySearch(int[] nums, int target, int l, int r) {
        while (l <= r) {
            int m = (r + l) / 2;
            if (nums[m] < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
            if (nums[m] == target) return m;
        }
        return -1;
    }
}
