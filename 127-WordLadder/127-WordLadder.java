// Last updated: 4/1/2026, 10:45:34 PM
class Pair{
    String first;
    int sec;
    public Pair(String first,int sec){
        this.first=first;
        this.sec=sec;
    }
}

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(beginWord,1));
        Set<String> st = new HashSet<>(wordList);
        if(!st.contains(endWord)) return 0;
        st.remove(beginWord);
        while(!q.isEmpty()){
            Pair p = q.poll();
            String word = p.first;
            int steps = p.sec;
            if(word.equals(endWord)) return steps;
            for(int i=0;i<word.length();i++){
                char[] arr = word.toCharArray();
                for(char ch='a'; ch<='z'; ch++){
                    arr[i] = ch;
                    String replaced = new String(arr);
                    if(st.contains(replaced)){
                        st.remove(replaced);
                        q.add(new Pair(replaced, steps+1));
                    }
                }
            }
        }
        return 0;
    }
}