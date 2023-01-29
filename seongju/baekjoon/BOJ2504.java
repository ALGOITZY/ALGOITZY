import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        /*
        (()[[]])([])
        2 * (2 + (3 * 3)) + 2 * 3
        2*2 + 2*3*3 + 2*3
        * */

        int count = 1; int result = 0;
        int left2 = 0; int left3 = 0;
        int right2 = 0; int right3 = 0;
        for(int i = 0; i<str.length(); i++) {
            char c = str.charAt(i);
            if(c == '(') {
                count *= 2;
                left2++;
            }
            else if(c == '[') {
                count *= 3;
                left3++;
            }
            else if(c == ')') {
                right2++;
                    if(i-1 < 0){
                        result = 0;
                        break;
                    }
                    if(str.charAt(i-1) == '(') {
                        result += count;
                        count /=2;
                    } else if(str.charAt(i-1) == '['){
                        result = 0;
                        break;
                    }
                    else if(str.charAt(i-1) == ')'){
                        count /=2;
                    } else if(str.charAt(i-1) == ']') {
                        count /=2;
                    }
                }
            else if(c == ']') {
                right3++;
                if(i-1 < 0){
                    result = 0;
                    break;
                }
                    if(str.charAt(i-1) == '[') {
                        result += count;
                        count /=3;

                    }
                    else if(str.charAt(i-1) == '('){
                        result = 0;
                        break;
                    }
                    else if(str.charAt(i-1) == ']'){
                        count /=3;
                    }
                    else if(str.charAt(i-1) == ')'){
                        count /=3;
                    }
                    else {
                        count = 1;
                    }
                } else {
                result = 0;
                break;
            }
        if(left2 < right2) {
            result = 0; break;
        }
        if(left3 < right3) {
            result =0; break;
        }
        }

        if(left2 != right2) {
            System.out.println(0);
        } else if(left3 != right3) {
            System.out.println(0);
        } else {
            System.out.println(result);
        }

    }
}
