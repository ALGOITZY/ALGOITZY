package algoitzy.week7;

import java.util.*;

// 베스트 앨범
public class PG42579 {
    public static void main(String[] args) {
        int[] solution = solution(
                new String[]{"classic", "pop", "classic", "classic", "pop"},
                new int[]{500, 600, 150, 800, 2500});

        System.out.println(Arrays.toString(solution));

    }

    public static int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> totalPlayCountMap = new LinkedHashMap<>(); // 장르별 총 재생 횟수
        Map<String, List<Music>> musicMap = new LinkedHashMap<>(); // 장르별 top2 노래를 담을 map

        for (int i = 0; i < plays.length; i++) {
            totalPlayCountMap.put(genres[i], totalPlayCountMap.getOrDefault(genres[i], 0) + plays[i]);
        }

        for (String key : totalPlayCountMap.keySet()) {
            List<Music> list = new ArrayList<>();
            for (int i = 0; i < genres.length; i++) {
                if (genres[i].equals(key)) {
                    list.add(new Music(i, genres[i], plays[i]));
                }
            }

            list.sort(new Comparator<Music>() {
                @Override
                public int compare(Music o1, Music o2) {
                    return o2.getCount() - o1.getCount();
                }
            });
            musicMap.put(key, list);
        }

        List<Map.Entry<String, List<Music>>> entryList = new ArrayList<>(musicMap.entrySet());
        entryList.sort(new Comparator<Map.Entry<String, List<Music>>>() {
            @Override
            public int compare(Map.Entry<String, List<Music>> o1, Map.Entry<String, List<Music>> o2) {
                return totalPlayCountMap.get(o2.getKey()) - totalPlayCountMap.get(o1.getKey());
            }
        });

        List<Integer> musicList = new ArrayList<>();
        for (Map.Entry<String, List<Music>> entry : entryList) {
            List<Music> list = entry.getValue();

            if(list.size() == 1) {
                musicList.add(list.get(0).getNo());
            } else {
                musicList.add(list.get(0).getNo());
                musicList.add(list.get(1).getNo());
            }
        }

        int[] result = new int[musicList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = musicList.get(i);
        }

        return result;
    }

    static class Music {
        private int no;
        private String genre;
        private int count;

        public Music() {}

        public Music(int no, String genre, int count) {
            this.no = no;
            this.genre = genre;
            this.count = count;
        }

        public int getNo() {
            return no;
        }
        public String getGenre() { return genre; }
        public int getCount() { return count; }
    }
}