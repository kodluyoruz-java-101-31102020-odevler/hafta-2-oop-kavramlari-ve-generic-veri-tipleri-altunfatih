package question01;

public class Main {

	public static void main(String[] args) {
		NumberUtil.run();
	}
}

class NumberUtil {
	public static void run() {
		int m[][] = new int[5][5];
        int row, col, count;

        row = 5;
        col = 5;
        count = 0;

        for (int i = 0; i < row; i++)
            for (int k = 0; k < col; k++) {
                count++;
                m[i][k] = count;
            }

        for (int i = 0; i < row; i++) {
            for (int k = 0; k < col; k++)
                System.out.print(m[i][k] + " ");
        }
	}
}

