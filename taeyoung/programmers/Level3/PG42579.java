package com.company.notes.programmers.study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PG42579 {
    public static void main(String[] args) {
        PG42579 test = new PG42579();
        String[] genres = {"classic"};
        int[] plays = {500};
        int[] result = test.solution(genres, plays);
        for (int i : result) {
            System.out.print(i + " ");
        }

    }

    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, ArrayList<Music>> hash = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            ArrayList<Music> list;
            if (hash.containsKey(genres[i])) {   //장르가 이미 저장되어있는 경우
                list = hash.get(genres[i]);
            } else {
                list = new ArrayList<>();
            }
            list.add(new Music(i, plays[i]));
            hash.put(genres[i], list);
        }

        ArrayList<Genres> genresList = new ArrayList<>();

        for (Map.Entry<String, ArrayList<Music>> entry : hash.entrySet()) {
            int sum = 0;
            for (Music music : entry.getValue()) {
                sum += music.plays;
            }
            genresList.add(new Genres(entry.getKey(), sum));
        }
        Collections.sort(genresList);
        ArrayList<Integer> answerArrList = new ArrayList<>();
        for (Genres g : genresList) {
            ArrayList<Music> list = hash.get(g.name);
            Collections.sort(list);
            if (list.size() < 2) {
                answerArrList.add(list.get(0).id);
            } else {
                for (int i = 0; i < 2; i++) {
                    answerArrList.add(list.get(i).id);
                }
            }

        }
        int[] answer = new int[answerArrList.size()];
        int size = 0;
        for (Integer value : answerArrList) {
            answer[size++] = value;
        }
        return answer;
    }
    class Music implements Comparable<Music> {
        int id;
        int plays;

        public Music(int id, int plays) {
            this.id = id;
            this.plays = plays;
        }

        @Override
        public int compareTo(Music m) {
            if (this.plays < m.plays) return 1;
            else if (this.plays > m.plays) return -1;
            else {
                if (this.id > m.id) return 1;
                else return -1;
            }
        }
    }

    class Genres implements Comparable<Genres> {
        String name;
        int totalPlays;

        public Genres(String name, int totalPlays) {
            this.name = name;
            this.totalPlays = totalPlays;
        }


        @Override
        public int compareTo(Genres g) {
            if (this.totalPlays < g.totalPlays) return 1;
            else return -1;
        }
    }

}

