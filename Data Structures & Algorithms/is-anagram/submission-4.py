class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        sComp = [0] * 26
        tComp = [0] * 26

        for i in range(len(s)):
            value = ord('a') - ord(s[i])
            sComp[value] = sComp[value] + 1

            value = ord('a') - ord(t[i])
            tComp[value] = tComp[value] + 1


        return sComp == tComp