class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize==0){
            int gp=0;
        Map<Integer,Integer> map=new TreeMap<>();
        for(int h:hand){
            map.put(h,map.getOrDefault(h,0)+1);
        }
        for (Integer key : map.keySet()){
            while(map.get(key)>0){
                for(int i=0;i<groupSize;i++){
                    int card=i+key;
                    if(map.getOrDefault(card,0)<=0) return false;
                    map.put(card,map.get(card)-1);
                } gp++;
            }
        }
        return gp==(hand.length/groupSize);
    }
    return false;
}
}
