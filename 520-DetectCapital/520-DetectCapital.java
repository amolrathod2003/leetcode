// Last updated: 5/27/2026, 12:11:38 PM
1class Solution {
2    public String capitalizeTitle(String title) {
3        String[] words = title.split(" ");
4        StringBuilder sb = new StringBuilder();
5        for (int i = 0; i < words.length; i++) {
6            String word = words[i];
7            if (word.length() <= 2) {
8                sb.append(word.toLowerCase());
9            } else {
10                sb.append(Character.toUpperCase(word.charAt(0)));
11                sb.append(word.substring(1).toLowerCase());
12            }
13            if (i < words.length - 1) {
14                sb.append(" ");
15            }
16        }
17        return sb.toString();
18    }
19}
20