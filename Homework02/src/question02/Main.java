package question02;

public class Main {

	public static void main(String[] args) {
		
		double m[][] = new double[10][10];
		double n[][] = new double[5][5];
		double randomNumber;
		
		
        for (int i = 0; i < m.length; i++)
            for (int k = 0; k < m.length; k++) {
                randomNumber = Math.random() * 10;
                m[i][k] = randomNumber;
            }
        
        for (int i = 0; i < n.length; i++)
            for (int k = 0; k < n.length; k++) {
                randomNumber = Math.random() * 10;
                n[i][k] = randomNumber;
            }
	}
}

class NumberUtil {
	public static void run() {
		
	}
	
}