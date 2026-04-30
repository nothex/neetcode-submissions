class TimeMap {
    HashMap<String,List<Pair>> map;
    public TimeMap() {
        map=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key,new ArrayList<>());
        map.get(key).add(new Pair(timestamp,value));
    }
    
    public String get(String key, int timestamp) {
        String st="";
        List<Pair> list=map.get(key);
        if(list == null) return st;
        else{
            int i=0,j=list.size()-1;
            while(i<=j){
                int mid=(j-i)/2+i;
                Pair res=list.get(mid);
                if(res.time == timestamp) return res.value;
                else if(res.time<timestamp) {
                    i=mid+1;
                    st=res.value;
                }
                else j=mid-1;
            }
            return st;
        }
    }
}
class Pair{
    int time;
    String value;
    Pair(int time,String value){
        this.time=time;
        this.value=value;
    }
}
