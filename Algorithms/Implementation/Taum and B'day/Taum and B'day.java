import java.math.BigInteger;
import java.util.Scanner;


public class Solution {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		long B;
		long W;
		long X;
		long Y;
		long Z;
		for(int i=0; i<T; i++){
			B = in.nextInt();
			W = in.nextInt();
			X = in.nextInt();
			Y = in.nextInt();
			Z = in.nextInt();
			if(X > (Y+Z)){
				X = Y+Z;
			}else if (Y > (X+Z)){
				Y = X+Z;
			}		
			long res = (X*B) + (Y*W);
			System.out.println(res);
		}
		
	}
		
}
