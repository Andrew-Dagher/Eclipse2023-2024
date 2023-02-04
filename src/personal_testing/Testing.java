package personal_testing;

public class Testing {

		public static void main(String[] args) {
		    int size = 10;
		    int[][] board = new int[size][size];
		    int position = 1;
		    boolean odd = true;
		    for (int i = size - 1; i >= 0; i--) {
		        if (odd) {
		            for (int j = 0; j < size; j++) {
		                board[i][j] = position;
		                position++;
		            }
		            odd = false;
		        } else {
		            for (int j = size - 1; j >= 0; j--) {
		                board[i][j] = position;
		                position++;
		            }
		            odd = true;
		        }
		    }
		    System.out.println("-".repeat(5 * size));
		    for (int i = 0; i < size; i++) {
		        System.out.print("|");
		        for (int j = 0; j < size; j++) {
		            System.out.printf("%3d |", board[i][j]);
		        }
		        System.out.println();
		        System.out.println("-".repeat(5 * size ));
		    }
		}
	}


