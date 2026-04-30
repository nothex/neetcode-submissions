class TimeMap {
    private static class Pair{
        int tim;
        String val;
        Pair(String val,int tim){
            this.tim=tim;
            this.val=val;
        }
        }
    private HashMap<String,List<Pair>> store;
    TimeMap() {
            store=new HashMap<>();    
    }
    public void set(String key, String value, int timestamp) {
        List<Pair> list=store.computeIfAbsent(key,k-> new ArrayList<>());
        list.add(new Pair(value,timestamp));
    }
    
    public String get(String key, int timestamp) {
        String res="";
        if(!store.containsKey(key)) return res;
        List<Pair> list=store.get(key);
        int low=0,high=list.size()-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            Pair current=list.get(mid);
            if(current.tim==timestamp) return current.val;
            else if(current.tim<timestamp) {low=mid+1;res=current.val;}
            else high=mid-1;
        }
        return res;
        
    }
}
