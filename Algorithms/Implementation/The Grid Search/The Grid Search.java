import java.util.Scanner;


public class Solution {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		
		for(int testCase = 0; testCase < T; testCase++){
			int[][] G = readGrid(in);
			int[][] P = readGrid(in);
			
			boolean found = false;
			for(int rowIndex = 0; rowIndex < G.length; rowIndex++){
				for(int colIndex = 0; colIndex <G[0].length; colIndex++){
					if(checkMatch(G, P, rowIndex, colIndex)){
						found = true;
						break;
					}
				}
			}
			System.out.println(found?"YES":"NO");
			
		}
		
	}
	
	//reads grid from console
	public static int[][] readGrid(Scanner in){
		int R = in.nextInt();
		int C = in.nextInt();
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
	//checks a int[][] grid for a match at supplied location
	public static boolean checkMatch(int[][] G, int[][] P, int x, int y){
		for(int rowIndex = 0; rowIndex < P.length; rowIndex++){
			for(int colIndex = 0; colIndex <P[0].length; colIndex++){
				try{
					if(P[rowIndex][colIndex] != G[x+rowIndex][y+colIndex]){
						return false;
					}
				}catch(ArrayIndexOutOfBoundsException e){
					return false;
				}
			}
		}
		return true;
	}
}
