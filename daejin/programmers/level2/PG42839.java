package level2;

import java.util.HashSet;

public class PG42839 {
	public int solution(String numbers) {
        HashSet<Integer> set = new HashSet<>();
        
     	permutation("", numbers, set); 
        
        int count = 0;
        while(set.iterator().hasNext()){
            int a = set.iterator().next();
            set.remove(a);
            if(a==2) count++;
            if(a%2!=0 && isPrime(a)){
                count++;
            }
        }        
        return count;
    }
	
    //각각의 자리를 만드는 함수
    public void permutation(String prefix, String str, HashSet<Integer> set) { 
        int n = str.length();        
        if(!prefix.equals("")) {
           set.add(Integer.valueOf(prefix));
        }
        
        for (int i = 0; i < n; i++){
          permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), set);
        }

    }
    
    //소수찾기 함수
    public boolean isPrime(int n){ 
        if(n==0 || n==1) return false;
        for(int i=2; i<=(int)Math.sqrt(n); i+=1){
            if(n%i==0) return false;
        }
        return true;
    }
}
