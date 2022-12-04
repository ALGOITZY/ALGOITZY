import java.util.*;
import java.io.*;
public class bj2309
{
    //https://www.acmicpc.net/problem/2309
    //일곱난쟁이
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalSum = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<9; i++){
            int height = Integer.parseInt(br.readLine());
            list.add(height);
            totalSum += height;
        }
        boolean flag = false;
        for(int i = 0; i < 9; i++){
            for(int j = i+1; j<9; j++){
                int e1 = list.get(i);
                int e2 = list.get(j);

                if((totalSum - (e1+e2)) == 100){
                    flag = true;
                    list.remove(Integer.valueOf(e1));
                    list.remove(Integer.valueOf(e2));
                    break;
                }
            }

            if(flag) break;
        }

        Collections.sort(list);
        list.forEach(System.out::println);
    }
}
