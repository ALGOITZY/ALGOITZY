import java.util.*;
// https://school.programmers.co.kr/learn/courses/30/lessons/42579#
// 베스트앨범
class pg42579 {
    public int[] solution(String[] genres, int[] plays) {
        
        // 1. 속한 노래가 많이 재생된 장르순으로 정리
        Map<String, List<Album>> map= new HashMap<>();      // 장르별 앨범 리스트 :: key : genre, value : Album
        Map<String, Integer> genreCntMap = new HashMap<>(); // 장르별 재생 수    ::key : genre, value : playCntSum
        for(int i = 0; i<genres.length; i++){
            // 장르별 재생 수
            int cnt = genreCntMap.getOrDefault(genres[i], 0);
            genreCntMap.put(genres[i], cnt + plays[i]);
            
            // 장르별 앨범 리스트
            List<Album> albumlist = map.getOrDefault(genres[i], new ArrayList<>());
            albumlist.add(new Album(genres[i], i, plays[i]));
            map.put(genres[i], albumlist);
        }
        
        List<String> genreList = new ArrayList<>();
        
        // value 내림차순 정렬
        List<Map.Entry<String, Integer>> sortList = new ArrayList<>(genreCntMap.entrySet());
		sortList.sort(Map.Entry.<String, Integer>comparingByValue().reversed());
        sortList.forEach((e)-> genreList.add(e.getKey()));
        
        List<Integer> resultList = new ArrayList<>();
        // 2. 장르 내에서 많이 재생된 노래, 고유번호가 낮은 노래 순으로 정렬
        for(String genre : genreList){
            List<Album> list = map.get(genre);
            Collections.sort(list, (e1, e2) -> e2.playCnt - e1.playCnt); // 내림차순 정렬
            
            // 3. 각 장르별 2개씩 수록곡 선정 -> 장르에 1개뿐이면 1개 만 선정
            resultList.add(list.get(0).index);
            if(list.size() > 1){
                resultList.add(list.get(1).index);
            }
        }
        
        int[] result = new int[resultList.size()];
        for(int i=0; i<resultList.size(); i++){
            result[i] = resultList.get(i);
        }
        return result;
    }
    
    class Album{
        String genre;
        int index;
        int playCnt;
        
        public Album(
        String genre,
        int index,
        int playCnt){
            this.genre = genre;
            this.index = index;
            this.playCnt = playCnt;
        }
    }
}
