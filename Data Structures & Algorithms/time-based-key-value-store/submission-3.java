class TimeMap {
    HashMap<String,TreeMap<Integer,String>> map;
    public TimeMap() {
        map=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key,new TreeMap<>());
        map.get(key).put(timestamp,value);
    }
    
    public String get(String key, int timestamp) {
        TreeMap<Integer,String> treeMap=map.get(key);
        if(treeMap == null) return "";
        Map.Entry<Integer,String> entry= treeMap.floorEntry(timestamp);
        return entry==null?"":entry.getValue();
    }
}
