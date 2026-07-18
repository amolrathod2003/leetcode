// Last updated: 7/18/2026, 4:24:50 PM
1class Solution {
2    public int findGCD(int[] nums) {
3        int min=nums[0];
4        int max=nums[0];
5        for(int num:nums){
6            if(num<min){
7                min=num;
8            }
9            if(num>max){
10                max=num;
11            }
12        }
13        return Gcd(min,max);
14        
15    }
16    public int Gcd(int a,int b){
17        while(b!=0){
18            int temp=b;
19            b=a%b;
20            a=temp;
21        }
22        return a;
23    }
24}