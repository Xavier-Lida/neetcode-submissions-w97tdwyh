class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        for i in range(len(nums)):
            new_liste = nums[i+1:]
            for j in range(len(new_liste)):
                if nums[i] == new_liste[j]:
                    return True
        return False