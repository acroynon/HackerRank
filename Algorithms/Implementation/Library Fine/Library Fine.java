import java.util.Scanner;


public class Solution {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int d = in.nextInt();
		int m = in.nextInt();
		int y = in.nextInt();
		int D = in.nextInt();
		int M = in.nextInt();
		int Y = in.nextInt();

		if(y < Y || (y<=Y && m<M) || (y<=Y && m<=M && d<=D)){
			System.out.println(0);
		}else{
			if(y > Y){
				System.out.println(10000);
			}else if (m > M){
				System.out.println(500 * (m-M));
			}else if(d > D){
				System.out.println(15 * (d-D));
			}else{
				System.out.println(0);
			}
		}
	}
			
	

}
