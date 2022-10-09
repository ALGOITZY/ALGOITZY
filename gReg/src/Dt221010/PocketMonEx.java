package Dt221010;

import java.util.*;

//�ּ�ó�� �ϸ� Error �� java.util.*�� ��� ������ Ŀ���ϴ� ���� �ƴѰ� ��
import java.util.stream.Stream; 

public class PocketMonEx {

	public int solution(int[] nums) {
		int answer = 0;
		int possibleNo = nums.length/2;
		String[] strs = new String[nums.length];
		
		// String ��ȯ 
		for (int a = 0; a < nums.length; a++) {
			strs[a] = Integer.toString(nums[a]);
		}
		
		// Steam : sqló�� �� �� ���� 
		Stream<String> s1 = Arrays.stream(strs);
		
		int distinctCnt = (int)s1.distinct().count();
		
		// runtime error : IllegalStateException - stream has already been operated upon or closed
		// if((int)s1.distinct().count() >= possibleNo)
		
		if(distinctCnt >= possibleNo) 
			answer = possibleNo;
		else
			answer = distinctCnt;
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3, 1, 2, 3 };
		int[] num2 = {3,3,3,2,2,4};
		int[] num3 = {3,3,3,2,2,2};
		PocketMonEx sol = new PocketMonEx();
		System.out.println(sol.solution(nums));
		System.out.println(sol.solution(num2));
		System.out.println(sol.solution(num3));
	}

}
