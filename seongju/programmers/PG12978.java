import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PG12978 {
    public static class Graph {
        int end;
        int length;

        public Graph(int end, int length) {
            this.end = end;
            this.length = length;
        }
    }

    public static int solution(int N, int[][] road, int K) {
        List<List<Graph>> map = new ArrayList<>();
        for(int i = 0; i<N+1; i++) {
            map.add(new ArrayList<>());
        }
        for(int i = 0; i< road.length; i++) {
            int start = road[i][0];
            int end = road[i][1];
            int length = road[i][2];

            map.get(start).add(new Graph(end, length));
            map.get(end).add(new Graph(start, length));
        }

        boolean[] visited = new boolean[N+1];
        int[] dp = new int[N+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[1] = 0;

        dfs(map, dp, visited, K, 1);

        int count = 0;
        for(int i = 0; i< dp.length; i++) {
            if(dp[i] <= K) {
                count++;
            }
        }
        System.out.println(Arrays.toString(dp));
        return count;


    }

    public static void dfs(List<List<Graph>> map, int[] dp, boolean[] visited, int K, int start) {
        if(dp[start] > K) {
            return;
        }

        for(int i = 0; i<map.get(start).size(); i++) {
            int endNode = map.get(start).get(i).end;
            int dist = map.get(start).get(i).length;

            if(!visited[endNode] && dp[start] + dist<= K && dp[endNode] > dp[start] + dist) {
                dp[endNode] = dp[start] + dist;
                visited[endNode] = true;
                dfs(map, dp, visited, K, endNode);
                visited[endNode] = false;

            }
        }
    }

    public static void main(String[] args) {
        int[][] road = new int[][]{{1, 2, 1}, {2,3,3}, {5,2,2}, {1,4,2}, {5,3,1}, {5,4,2}};
        int n = solution(5, road, 3);
        System.out.println(n);
    }
}
