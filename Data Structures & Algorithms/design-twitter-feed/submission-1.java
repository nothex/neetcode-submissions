class Twitter {

    static int timestamp=0;
    private static class Tweet{
        int time;
        int tweetid;
        Tweet(int time, int tweetid){
            this.time=time;
            this.tweetid=tweetid;
        }
    }
    HashMap<Integer,List<Tweet>> tweets;
    HashMap<Integer,Set<Integer>> following;

    public Twitter() {
        tweets=new HashMap<>();
        following=new HashMap<>();
    }
    
    public void postTweet(int userId, int tweetId) {
        tweets.putIfAbsent(userId,new ArrayList<>());
        tweets.get(userId).add(new Tweet(timestamp++,tweetId));
    }
    
    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<Tweet> heap = new PriorityQueue<>((a,b)->(b.time-a.time));
        Set<Integer> users=new HashSet<>();
        users.add(userId);
        if(following.containsKey(userId)){
            users.addAll(following.get(userId));
        }
        for(int uid:users){
            List<Tweet> userTweets=tweets.getOrDefault(uid,new ArrayList<>());
            for(Tweet tweet:userTweets){
                heap.offer(tweet);
            }
        }
        List<Integer> feed=new ArrayList<>();
        int count=0;
        while(!heap.isEmpty() && count < 10){
            feed.add(heap.poll().tweetid);
            count++;
        }
        return feed;
    }
    
    public void follow(int followerId, int followeeId) {
        if(followerId==followeeId) return;
        following.putIfAbsent(followerId,new HashSet<>());
        following.get(followerId).add(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        if(following.containsKey(followerId)){
            following.get(followerId).remove(followeeId);
        }
    }
}
