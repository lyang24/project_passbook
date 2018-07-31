import java.util.*;

public class PQ {
    public static void main (String args[]) {
        int[][] matrix = new int[][] {{1,3,5,7},{2,4,8,9},{3,5,11,15},{6,8,13,18}};
        int res = kthSmallest(matrix, 4);
        System.out.println(res);
    }
    public static int kthSmallest(int[][] matrix, int k) {
        // Write your solution here
        int row = 0;
        int col = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        while (pq.size() <= k) {
            if (col < matrix[0].length - 1) pq.offer(matrix[row][++col]);
            if (row < matrix.length - 1) pq.offer(matrix[++row][col]);
        }

        return pq.poll();
    }
}
