import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Solution {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int H = in.nextInt();
		int M = in.nextInt();
		boolean past = false;
		String[] words = new String[]{
				"one","two","three","four","five","six","seven","eight","nine","ten",
				"eleven","twelve","thirteen","fourteen", "quarter", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", 
				"twenty one", "twenty two", "twenty three", "twenty four", "twenty five", 
				"twenty six", "twenty seven", "twenty eight","twenty nine"
		};
		
		if(M > 30){
			M = 60-M;
			past = true;
		}
		if(M == 0){
			System.out.println(words[H-1] + " o' clock");
		}else if(M == 30){
			System.out.println("half past " + words[H-1]);
		}else{
			System.out.println(words[M-1] + ((M!=15)?" minutes ":" ") + ((past)?"to " + words[H]:"past " + words[H-1]));
		}
	}
		
}
