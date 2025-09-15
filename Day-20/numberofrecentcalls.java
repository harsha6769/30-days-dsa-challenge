import java.util.*;

class RecentCounter {
    Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.add(t);
        while (queue.peek() < t - 3000) {
            queue.poll();
        }
        return queue.size();
    }
}

public class Main{
    public static void main(String[] args) {
        RecentCounter obj = new RecentCounter();
        System.out.println(obj.ping(1));    // 1
        System.out.println(obj.ping(100));  // 2
        System.out.println(obj.ping(3001)); // 3
        System.out.println(obj.ping(3002)); // 3
    }
}
