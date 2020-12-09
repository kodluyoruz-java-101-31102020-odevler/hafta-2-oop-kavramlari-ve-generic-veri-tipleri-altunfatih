package question03;

public class Main {

	public static void main(String[] args) {
		NumberUtil.run();
	}
}

class NumberUtil {
	public static void run() {
		int m[] = new int[10];
		int randomNumber;
		
		 for (int i = 0; i < m.length; i++) {
             randomNumber = (int) (Math.random() * 10);
             m[i] = randomNumber;
         }
		 
		 for (int i = 0; i < m.length; i++)
				System.out.print(m[i] + " ");
		
		 System.out.println("\n------------");   
		 		
	     for(int i = 0; i < m.length; i++) {
	    	 for(int j = i + 1; j < m.length; j++)
	    		 if(m[i] == m[j])  
	    			 System.out.println(m[j]);  
	     }
	}
}