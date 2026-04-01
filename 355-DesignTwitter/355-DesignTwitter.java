// Last updated: 4/1/2026, 10:44:10 PM
import java.util.*;

class Twitter {

    private static int timeStamp = 0;

    class Tweet {
        int id;
        int time;
        Tweet next;

        Tweet(int id) {
            this.id = id;
            this.time = timeStamp++;
            this.next = null;
        }
    }

    Map<Integer, Tweet> tweets;
    Map<Integer, Set<Integer>> followings;

    public Twitter() {
        tweets = new HashMap<>();
        followings = new HashMap<>();
    }

    public void postTweet(int userId, int tweetId) {
        Tweet t = new Tweet(tweetId);
        if (tweets.containsKey(userId)) {
            t.next = tweets.get(userId);
        }
        tweets.put(userId, t);
    }

    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<Tweet> pq = new PriorityQueue<>(
            (a, b) -> b.time - a.time
        );

        if (tweets.containsKey(userId))
            pq.add(tweets.get(userId));

        if (followings.containsKey(userId)) {
            for (int followee : followings.get(userId)) {
                if (tweets.containsKey(followee))
                    pq.add(tweets.get(followee));
            }
        }

        List<Integer> res = new ArrayList<>();
        while (!pq.isEmpty() && res.size() < 10) {
            Tweet t = pq.poll();
            res.add(t.id);
            if (t.next != null)
                pq.add(t.next);
        }

        return res;
    }

    public void follow(int followerId, int followeeId) {
        followings.computeIfAbsent(followerId, k -> new HashSet<>());
        followings.get(followerId).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if (followings.containsKey(followerId)) {
            followings.get(followerId).remove(followeeId);
        }
    }
}
