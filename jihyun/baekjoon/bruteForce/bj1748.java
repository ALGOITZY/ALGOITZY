import java.util.*;
import java.io.*;
public class bj1748
{
    // https://www.acmicpc.net/problem/1748
    // 수 이어 쓰기 1
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =  Integer.parseInt(br.readLine());

        if(n<10) {
            System.out.println(n);
            return;
        }

        long result = 9;
        long size = 100;
        long lengthSize = 1;

        for(int i = 2; i <= String.valueOf(n).length(); i++){
            lengthSize ++;
            long count = n<size ? n-(size/10)+1 : size-(size/10);

            size*=10;
            result += count*lengthSize;
        }

        System.out.println(result);
    }
}
