import java.util.*;
import java.io.*;
public class bj1476
{
  // https://www.acmicpc.net/problem/1476
  // 날짜 계산
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ESM = br.readLine().split(" ");
        int earth = Integer.parseInt(ESM[0]);    // 1 ≤ E ≤ 15
        int sun = Integer.parseInt(ESM[1]);      // 1 ≤ S ≤ 28
        int moon = Integer.parseInt(ESM[2]);     // 1 ≤ M ≤ 19

        int e = 1; int s = 1; int m = 1; 
        int year = 1;
        while(!(earth == e && sun == s && moon == m)){
            year +=1;

            e = e == 15 ? 1 : e+1;
            s = s == 28 ? 1 : s+1;
            m = m == 19 ? 1 : m+1;
        }

        System.out.println(year);
    }
}
