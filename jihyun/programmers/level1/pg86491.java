
//https://school.programmers.co.kr/learn/courses/30/lessons/86491
// 최소 직사각형
public class pg86491 {
    public int solution(int[][] sizes) {
        int width = 0, vertical = 0;
        for(int i=0; i< sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
            width = Math.max(width, sizes[i][0]);
            vertical = Math.max(vertical, sizes[i][1]);
        }

        return width * vertical;
    }
}
