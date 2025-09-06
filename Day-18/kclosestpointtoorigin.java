import java.util.PriorityQueue;

class Solution973 {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (a, b) -> (distance(b) - distance(a))
        );

        for (int[] p : points) {
            maxHeap.offer(p);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.poll();
        }
        return result;
    }

    private int distance(int[] p) {
        return p[0] * p[0] + p[1] * p[1];
    }

    // Main method for testing
    public static void main(String[] args) {
        Solution973 sol = new Solution973();
        int[][] points = {{3,3},{5,-1},{-2,4}};
        int k = 2;
        int[][] result = sol.kClosest(points, k);
        System.out.println("K Closest Points:");
        for (int[] p : result) {
            System.out.println("[" + p[0] + "," + p[1] + "]");
        }
    }
}
