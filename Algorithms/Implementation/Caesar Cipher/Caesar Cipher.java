import java.util.Scanner;


public class Solution {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.nextLine();
		String s = in.nextLine();
		int K = in.nextInt();
		
		for(int i=0; i<N; i++){
			int ascii = (int) s.charAt(i);
			//lowercase
			if(ascii >= 65 && ascii <= 90){
				ascii = (int)(ascii+K);
				while(ascii > 90){
					ascii -= 26;
				}
			}
			//uppercase
			if(ascii >= 97 && ascii <= 122){
				ascii = (int)(ascii+K);
				while(ascii > 122){
					ascii -= 26;
				}
			}
			
			System.out.print((char)ascii);
		}
		
	}
}
