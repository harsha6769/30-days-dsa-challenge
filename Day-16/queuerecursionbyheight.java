import java.util.*;

public class QueueReconstruction {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> {
            if (a[0] != b[0]) return b[0] - a[0]; // higher first
            return a[1] - b[1];                   // smaller k first
        });

        List<int[]> res = new LinkedList<>();
        for (int[] p : people) {
            res.add(p[1], p); // insert at index k
        }
        return res.toArray(new int[people.length][]);
    }

    public static void main(String[] args) {
        QueueReconstruction sol = new QueueReconstruction();
        int[][] people = {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
        int[][] result = sol.reconstructQueue(people);

        for (int[] p : result) {
            System.out.println(Arrays.toString(p));
        }
        // Expected output: [5,0], [7,0], [5,2], [6,1], [4,4], [7,1]
    }
}
