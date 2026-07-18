# Last updated: 7/18/2026, 4:38:50 PM
1class Solution(object):
2    def findGCD(self, nums):
3        min_num = nums[0]
4        max_num = nums[0]
5        
6        for num in nums:
7            if num < min_num:
8                min_num = num
9            if num > max_num:
10                max_num = num
11                
12        return self.gcd(max_num, min_num)
13
14    def gcd(self, a, b):
15        while b != 0:
16            temp = b
17            b = a % b
18            a = temp
19        return a
20