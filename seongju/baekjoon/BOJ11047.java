import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String NK = br.readLine();
        String[] nkArr = NK.split(" ");
        int N = Integer.parseInt(nkArr[0]);
        int K = Integer.parseInt(nkArr[1]);
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<N; i++) {
            String money = br.readLine();
            map.put(Integer.parseInt(money), 0);
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort(Comparator.reverseOrder());

        for (Integer integer : list) {
            if (K / integer > 0) {
                int count = K / integer;
                map.put(integer, count);
                K %= integer;
            }
        }
        List<Integer> list1 = new ArrayList<>(map.values());
        int answer = 0;
        for (Integer integer : list1) {
            answer += integer;
        }

        System.out.println(answer);



    }
}
