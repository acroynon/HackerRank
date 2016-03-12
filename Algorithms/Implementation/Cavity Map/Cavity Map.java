import java.util.Collections;
import java.util.Scanner;


public class Solution {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[][] grid = readGrid(in, N, N);
		int[][] res = new int[N][N];
				
		for(int rowIndex = 0; rowIndex < N; rowIndex++){
			for(int colIndex = 0; colIndex < N; colIndex++){
				int check = grid[rowIndex][colIndex];
				if(rowIndex > 0 && rowIndex < N-1 && colIndex > 0 && colIndex < N-1 
							&& check > grid[rowIndex+1][colIndex] 
							&& check > grid[rowIndex-1][colIndex]
							&& check > grid[rowIndex][colIndex+1]
							&& check > grid[rowIndex][colIndex-1]){
					System.out.print('X');
				}else{
					System.out.print(check);
				}
			}
			System.out.println();
		}
	}
	
	//reads grid from console
	public static int[][] readGrid(Scanner in, int numOfRows, int numOfCols){
		int R = numOfRows;
		int C = numOfCols;
		in.nextLine();
		int[][] G = new int[R][C];
		//fill the grid G
		for(int rows =0; rows<R; rows++){
			String s = in.nextLine();
			String[] numbers = s.split("");
			for(int num =0; num< numbers.length; num++){
				G[rows][num] = new Integer(numbers[num]);
			}
		}
		return G;
	}
}
