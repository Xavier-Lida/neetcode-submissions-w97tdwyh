class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in enumerate(nums):
            for j in range(len(nums)):
                rep = target - i[1]
                if nums[j] == rep and i[0] != j:
                    return [i[0], j]