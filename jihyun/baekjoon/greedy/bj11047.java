import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://www.acmicpc.net/problem/11047
// 11047 동전o

public class bj11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nk =  br.readLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);

        List<Integer> priceList = new ArrayList<>();
        for(int i=0; i<n; i++){
            priceList.add(Integer.parseInt(br.readLine()));
        }

        // 금액권 내림차순 정렬
        Collections.reverse(priceList);

        int count = 0;
        for(int price : priceList){
            if(k == 0) break;
            if(k>=price){
                int share = k / price;
                count += share;

                k = k % price;
            }
            continue;
        }

        System.out.println(count);

    }

}