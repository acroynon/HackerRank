import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//number of test cases
		int T = in.nextInt();
		//amount of money
		int N;
		//cost of chocolate bar
		int C;
		//wrappers needed for discount
		int M;
		int numOfBars;
		int numOfWrappers;
		for(int testCaseNum = 0; testCaseNum < T; testCaseNum++){
			N = in.nextInt();
			C = in.nextInt();
			M = in.nextInt();
			numOfBars = 0;
			numOfWrappers = 0;
			//how many you get for money
			numOfBars += (int) N/C;
			numOfWrappers = numOfBars;
			//how many you get for discounts
			while(numOfWrappers >= M){
				numOfWrappers -= (M -1);
				numOfBars++;
			}
			System.out.println(numOfBars);
		}
	}

}
