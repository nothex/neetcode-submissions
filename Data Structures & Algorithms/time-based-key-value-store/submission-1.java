class TimeMap {
    private static class Pair{
        int timestamp;
        String value;
        Pair(String value,int timestamp){
            this.value=value;
            this.timestamp=timestamp;
        }
    }
    HashMap<String,List<Pair>> tab;
    public TimeMap() {
        tab=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        
        if(!tab.containsKey(key)) tab.put(key,new ArrayList<>());
        List<Pair> list=tab.get(key);
        list.add(new Pair(value,timestamp));
    }
    
    public String get(String key, int timestamp) {
        String res="";
        if(!tab.containsKey(key)) return res;
        List<Pair> list=tab.get(key);
        int low=0,high=list.size()-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            Pair current=list.get(mid);
            if(current.timestamp==timestamp) return current.value;
            else if(current.timestamp<timestamp){
                res=current.value;
                low=mid+1;
            }
            else high=mid-1;
        }
        return res;
    }
}
