package classwork_6;

public class Ten {
	public static void main(String[] args) {
		int number = 100000;
		
        int evenCount = 0;
        int oddCount = 0;
        
        while(number > 0) {
        	if(number % 2 == 0) {
        		evenCount++;
        	}else {
        		oddCount++;
        	}
        }
        
        for(int sum = 0; number >= 0; number--) {
        	sum += number;
        }
	}
}
