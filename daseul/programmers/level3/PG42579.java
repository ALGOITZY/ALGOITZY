package programmers.level3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PG42579 {
	public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        Map<String, List<Integer>> genreSongIdMap = new HashMap<>();
        Map<String, Integer> genreCountMap = new HashMap<>();
        List<Integer> resultList = new ArrayList<>();

        for(int idx = 0; idx < genres.length; idx++) {
        	String genre = genres[idx];
        	Integer newPlayCount = plays[idx];

        	List<Integer> playList = genreSongIdMap.get(genre);
        	if(playList == null) {
        		playList = new ArrayList<>();
        	}
        	playList.add(idx);

        	genreSongIdMap.put(genre, playList);

        	Integer playCount = genreCountMap.get(genre) != null ? genreCountMap.get(genre) : 0;
        	genreCountMap.put(genre, playCount + newPlayCount);
        }

        Map<String, Integer> sortedGenreOrderIdMap = new LinkedHashMap<>();
        genreCountMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        	.forEachOrdered(x -> sortedGenreOrderIdMap.put(x.getKey(), x.getValue()));

        for(String genre : sortedGenreOrderIdMap.keySet()) {
       		List<Integer> playList = genreSongIdMap.get(genre);

       		int pickCount = playList.size() < 2 ? playList.size() : 2;

       		int[] playOrderArr = {0, 0};
       		int[] playSongCountArr = {0, 0};
       		for(Integer songId : playList) {
       			if(plays[songId] > playSongCountArr[1]) {
       				if(plays[songId] > playSongCountArr[0]) {
       					playOrderArr[1] = playOrderArr[0];
       					playOrderArr[0] = songId;
       					playSongCountArr[1] = playSongCountArr[0];
       					playSongCountArr[0] = plays[songId];
       				} else {
       					playOrderArr[1] = songId;
       					playSongCountArr[1] = plays[songId];
       				}
       			}
       		}
        	resultList.addAll(pickCountFromArray(playOrderArr, pickCount));
        }

        answer = resultList.stream().mapToInt(i -> i).toArray();
        return answer;
    }

    private List<Integer> pickCountFromArray(int[] playCountOrder, int pickCount) {
		List<Integer> resultList = new ArrayList<>();
		for(int idx = 0 ; idx < pickCount ; idx++) {
			resultList.add(playCountOrder[idx]);
		}
		return resultList;
	}
}
