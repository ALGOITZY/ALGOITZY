package programmers.level3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PG42579 {
	public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        Map<String, List<Integer>> genreSongIdMap = new HashMap<>();
        Map<Integer, String> genreOrderMap = new HashMap<>();
        Map<String, Integer> genreOrderIdMap = new HashMap<>();
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

        	Integer playCount = genreOrderIdMap.get(genre);
        	if(playCount == null){
        		playCount = 0;
        	}
        	genreOrderIdMap.put(genre, playCount + newPlayCount);
        }

        int[] orderArr = new int[genreSongIdMap.size()];
        /*
        int count = 0;
        for(String genre : genreSongIdMap.keySet()) {
        	List<Integer> songIdList = genreSongIdMap.get(genre);
        	genreOrderMap.put(songIdList.size(), genre);
        	orderArr[count++] = songIdList.size();
        }
        */
        Map<String, Integer> sortedGenreOrderIdMap = new LinkedHashMap<>();


        genreOrderIdMap.entrySet()
  .stream()
  .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
  .forEachOrdered(x -> sortedGenreOrderIdMap.put(x.getKey(), x.getValue()));


        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(genreOrderIdMap.entrySet());
        entryList.sort(Map.Entry.comparingByValue());
        //for(Map.Entry<String, Integer> entry : entryList){
        for(String genre : sortedGenreOrderIdMap.keySet()) {
        	//String genre = entry.getKey();
       		List<Integer> playList = genreSongIdMap.get(genre);
        	int[] playCountOrder = new int[playList.size()];
       		int idx = 0;

       		int pickCount = playList.size() < 2 ? playList.size() : 2;

       		int[] playOrderArr = {0, 0};
       		int[] playSongCountArr = {0, 0};
       		for(Integer songId : playList) {
       			//playCountOrder[idx++] = plays[songId];
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

        		//Arrays.sort(playCountOrder);
        		//resultList.addAll(pickCountFromArray(playCountOrder, pickCount));
        		resultList.addAll(pickCountFromArray(playOrderArr, pickCount));
        }

        /*
        Arrays.sort(orderArr);
        for(int genreCount : orderArr) {
        	String genre = genreOrderMap.get(genreCount);
        	List<Integer> playList = genreSongIdMap.get(genre);
        	int[] playCountOrder = new int[playList.size()];
        	int idx = 0;

        	int pickCount = playList.size() < 2 ? playList.size() : 2;
        	int[] playOrderArr = {0, 0};
        	for(Integer songId : playList) {
        		//playCountOrder[idx++] = plays[songId];
        		if(plays[songId] > playOrderArr[0]) {
       				playOrderArr[1] = playOrderArr[0];
       				playOrderArr[0] = songId;
        		}
        	}

        	//Arrays.sort(playCountOrder);
        	//resultList.addAll(pickCountFromArray(playCountOrder, pickCount));
        	resultList.addAll(pickCountFromArray(playOrderArr, pickCount));

        }

        */
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
