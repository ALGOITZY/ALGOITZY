import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        String irons = br.readLine();

        int count = 0;

        int total = 0;

        for(int i = 0; i<irons.length(); i++) {
            char c = irons.charAt(i);

            if(c == '(') {
                count++;
            } else {
                count--;
                if(irons.charAt(i-1) == '(') {
                    total += count;
                } else {
                    total++;
                }
            }
        }

        System.out.println(total);
    }
}
