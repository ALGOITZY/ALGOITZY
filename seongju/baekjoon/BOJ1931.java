import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BOJ1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] time  = new int[n][2];
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i<n; i++) {
            String[] arr = br.readLine().split(" ");
            int start = Integer.parseInt(arr[0]);
            int end = Integer.parseInt(arr[1]);
            list.add(List.of(start, end));
        }

        int[][] dp = new int[n][2];
        List<List<Integer>> list1 = new ArrayList<>();
        list = list.stream()
                .sorted((o1, o2) -> {
                    int i1 = o1.get(1) - o1.get(0);
                    int i2 = o2.get(1) - o2.get(0);
                    if(o1.get(1) == o2.get(1)) {
                        return o1.get(0) - o2.get(0);
                    } if(o1.get(0) == o2.get(0)) {
                        return i1 - i2;
                    }
                    return o1.get(1) - o2.get(1);
                }).collect(Collectors.toList());
        int count = 0;
        list1.add(List.of(list.get(0).get(0), list.get(0).get(1)));
        for(int i = 1; i<n; i++) {
            int end = list1.get(list1.size()-1).get(1);
            int start = list.get(i).get(0);
            if(end <= start) {
                list1.add(List.of(start, list.get(i).get(1)));
            }
        }
        System.out.println(list1.size());
    }
}
