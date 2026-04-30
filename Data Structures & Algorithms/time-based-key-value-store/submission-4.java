class TimeMap {
    HashMap<String,List<Pair>> map;
    public TimeMap() {
        map=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key,new ArrayList<>());
        map.get(key).add(new Pair(value,timestamp));
    }
    
    public String get(String key, int timestamp) {
        String res="";
        List<Pair> list=map.get(key);
        if(list == null) return res;
        int i=0,j=list.size()-1;
        while(i<=j){
            int mid=(j-i)/2+i;
            if(list.get(mid).time==timestamp) return list.get(mid).val;
            else if(list.get(mid).time<timestamp) {
                i=mid+1;
                res=list.get(mid).val;
            }
            else j=mid-1;
        }
        return res;
    }
}
class Pair{
    String val;
    int time;
    Pair(String val,int time){
        this.val=val;
        this.time=time;
    }
}
