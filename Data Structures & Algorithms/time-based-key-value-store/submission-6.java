class TimeMap {
    HashMap<String,TreeMap<Integer,String>> map;
    public TimeMap() {
        map=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new TreeMap<>());
        map.get(key).put(timestamp,value);
    }
    
    public String get(String key, int timestamp) {
        TreeMap<Integer,String> tree=map.get(key);
        if(tree == null) return "";
        else{
            Map.Entry<Integer,String> checker=tree.floorEntry(timestamp);
            return checker==null?"":checker.getValue();
        }
    }
}
