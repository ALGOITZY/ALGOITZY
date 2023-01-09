import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// 팰린드롬 만들기

public class BOJ1213 {
    static class Solution {
        public void sol() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            int[] alpha = new int[26];
            for(int i=0; i<line.length(); i++) {
                int idx = line.charAt(i)-'A';
                alpha[idx]++;
            }

            int isOne =0;
            for(int i=0; i<alpha.length; i++) {
                if(alpha[i]%2!=0) isOne++;
            }

            String answer ="";
            StringBuilder sb = new StringBuilder();
            if(isOne>1) answer += "I'm Sorry Hansoo";
            else {
                for(int i=0; i<alpha.length; i++) {
                    for(int r=0; r<alpha[i]/2; r++) {
                        sb.append((char)(i+65));
                    }
                }
                answer += sb.toString();
                String end = sb.reverse().toString();

                sb = new StringBuilder();
                for(int i=0; i<alpha.length; i++) {
                    if(alpha[i]%2==1) {
                        sb.append((char)(i+65));
                    }
                }
                answer +=sb.toString()+end;
            }
            System.out.println(answer);
        }


        Solution() {}
    }

    public static class Main {
        public void main(String[] args) throws IOException {

//        test code
            Solution solution = new Solution();
            System.out.println("============= 1 번");
            solution.sol();


        }
    }

}
