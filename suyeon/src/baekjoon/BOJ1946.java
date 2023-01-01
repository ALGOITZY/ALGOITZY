package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;

public class BOJ1946 {
	static class Applicant {
		int document;
		int interview;

		Applicant(int document, int interview) {
			this.document = document;
			this.interview = interview;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());
		while (t > 0) {
			ArrayList<Applicant> applicants = new ArrayList<>();
			int n = Integer.parseInt(br.readLine());
			int maxRank = n + 1;

			while (n > 0) {
				String line = br.readLine();
				int pos = line.indexOf(" ");
				int a = Integer.parseInt(line.substring(0, pos));
				int b = Integer.parseInt(line.substring(pos + 1));
				Applicant applicant = new Applicant(a, b);

				applicants.add(applicant);

				n--;
			}

			applicants.sort(Comparator.comparingInt(o -> o.document));

			int result = 0;
			for(Applicant applicant: applicants){

				if(maxRank > applicant.interview){
					maxRank = applicant.interview;
					result += 1;
				}
			}

			bw.write(Integer.toString(result));
			bw.newLine();

			t--;
		}

		bw.close();
	}
}