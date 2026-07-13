// Last updated: 7/13/2026, 5:06:27 PM
1import java.util.ArrayList;
2import java.util.List;
3
4class Solution { 
5    public List<Integer> sequentialDigits(int low, int high) { 
6        List<Integer> res = new ArrayList<>(); 
7        String sample = "123456789"; 
8        for (int l = 2; l <= 9; l++) { 
9            for (int s = 0; s <= 9 - l; s++) { 
10                String sub = sample.substring(s, s + l); 
11                int num = Integer.parseInt(sub); 
12                
13                if (num >= low && num <= high) { 
14                    res.add(num); 
15                } 
16            } 
17        } 
18        return res; 
19    } 
20}
21