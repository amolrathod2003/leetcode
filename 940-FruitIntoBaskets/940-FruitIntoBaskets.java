// Last updated: 4/1/2026, 10:42:37 PM
class Solution {
    public int totalFruit(int[] fruits) {
        int left=0,maxlen=0;
        HashMap<Integer,Integer> basket=new HashMap<>();
        for(int right=0;right<fruits.length;right++){
            basket.put(fruits[right],basket.getOrDefault(fruits[right],0)+1);
            while(basket.size()>2){
                 int fruitLeft=fruits[left];
                basket.put(fruitLeft,basket.get(fruitLeft)-1);
                 if(basket.get(fruitLeft)==0){
                    basket.remove(fruitLeft);
                }
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);

        }
        return maxlen;
        
    }
}