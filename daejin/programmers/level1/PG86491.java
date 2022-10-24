package level1;

public class PG86491 {
	 public static int minRectangle(int[][] sizes) {
		 	
		 	int height = 0;
	        int width = 0;
	        int result = 0;
	        
	        for(int i = 0; i < sizes.length; i++){
	            int a = Math.max(sizes[i][0], sizes[i][1]);
	            int b = Math.min(sizes[i][0], sizes[i][1]);
	            
	            height = Math.max(height, a);
	            width = Math.max(width, b);
	        }
	        
	        result = height * width;
	        
	        return result;	        
	    }
}
