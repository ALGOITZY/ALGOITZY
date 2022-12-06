package com.company.notes.study.week10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

/*
 * ATM
 * */
public class BOJ11399 {
    public static void main(String[] args) throws IOException {
        BOJ11399 test = new BOJ11399();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(test.solution(n, arr));
    }

    public static int solution(int n, int[] arr) {
        int answer = 0;
        ArrayList<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            people.add(new Person(i, arr[i]));
        }
        people.sort(Comparator.comparingInt(Person::getTime));

        for (int i = 0; i < n; i++) {
            answer += people.get(i).getTime() * (n - i);
        }

        return answer;
    }

    static class Person {
        int id;
        int time;

        Person(int id, int time) {
            this.id = id;
            this.time = time;
        }

        int getTime() {
            return time;
        }
    }
}
