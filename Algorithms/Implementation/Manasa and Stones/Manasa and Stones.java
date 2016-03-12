import java.util.Scanner;


public class Solution {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		
		for(int i=0; i<T; i++){
			int N = in.nextInt();
			int one = in.nextInt();
			int two = in.nextInt();
			int a = Math.min(one,  two);
			int b = Math.max(one,  two);
			if(a==b){
				System.out.println((N-1) * a);
			}else{
				for(int j=0; j<N-1; j++){
					System.out.print(j*b + ((N-1-j)*a) + " ");
				}
				System.out.print(b*(N-1));
				System.out.println();
			}
			
		}
	}

}
