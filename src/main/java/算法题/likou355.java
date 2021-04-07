package 算法题;

import javax.jws.soap.SOAPBinding;
import java.util.*;

public class likou355 {
    private static int timestamp = 0;

    private static class Tweet {
        private int id;
        private int time;
        private Tweet next;

        public Tweet(int id, int time) {
            this.id = id;
            this.time = time;
            this.next = null;
        }

    }

    private static class User {
        private int id;
        //关于关注用户的set映射
        private Set<Integer> followed;
        private Tweet head;

        public User(int userId) {
            this.id = userId;
            this.followed = new HashSet<>();
            this.head = null;
            follow(id);
        }

        public void follow(int id) {
            followed.add(id);
        }

        public void unfollow(int userId) {
            if (userId != this.id) {
                followed.remove(userId);
            }
        }

        public void post(int tweetId) {
            Tweet tweet1 = new Tweet(tweetId, timestamp);
            timestamp++;
            tweet1.next = head;
            head = tweet1;
        }
    }

    private HashMap<Integer, User> userHashMap = new HashMap<>();

    public void postTweet(int userId, int tweetId) {
        if (!userHashMap.containsKey(userId)) {
            User user = new User(userId);
            userHashMap.put(userId, user);
        }
        User user = userHashMap.get(userId);
        user.post(tweetId);
    }
    //返回该user关注的人的最近动态10条
    public List<Integer> getNewsFeed(int userId) {
        ArrayList<Integer> res = new ArrayList<>();
        if (!userHashMap.containsKey(userId))return res;
        Set<Integer> users = userHashMap.get(userId).followed;
        //按照用户更新twitter消息按最近都最远排列
        PriorityQueue<Tweet> priorityQueue=new PriorityQueue<>(users.size(),(a,b)->
                (b.time-a.time));
        for (int id : users) {
            Tweet headTwt = userHashMap.get(id).head;
            if (headTwt==null)continue;
            priorityQueue.add(headTwt);
        }
        while(!priorityQueue.isEmpty()){
            if (res.size()==10)break;
            Tweet poll = priorityQueue.poll();
            res.add(poll.id);
            //将下一篇tweet插入进行排序好推送最新一条tweet
            if (poll.next!=null){
                priorityQueue.add(poll.next);
            }
        }
        return res;
    }

    public void follow(int followerId, int followedId) {
        if (!userHashMap.containsKey(followerId)) {
            User user = new User(followerId);
            userHashMap.put(followerId, user);
        }
        if (!userHashMap.containsKey(followedId)) {
            User user = new User(followedId);
            userHashMap.put(followedId, user);
        }
        userHashMap.get(followerId).follow(followedId);
    }

    public void unfollow(int followerId, int followeeId) {
        if (userHashMap.containsKey(followerId)) {
            userHashMap.get(followerId).unfollow(followeeId);
        }
    }

}
