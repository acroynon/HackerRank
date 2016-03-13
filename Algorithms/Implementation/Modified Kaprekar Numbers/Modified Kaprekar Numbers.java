import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Solution {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int p = in.nextInt();
		int w = in.nextInt();
		boolean valid = false;
		for(long i=p; i<=w; i++){
			long sqr = i * i;
			String str = Long.toString(sqr);
			String one = "";
			String two = "";
			for(int j=0; j < (int)(str.length()/2); j++){
				one = one + str.charAt(j);
			}
			for(int j=one.length(); j<str.length(); j++){
				two = two + str.charAt(j);
			}
			if(one == ""){ 
				one = "0";
			}
			if(two==""){
				two = "0";
			}
			if( (new Integer(one)) + (new Integer(two)) == i){
				System.out.print(i + " ");
				valid = true;
			}
		}
		if(!valid){
			System.out.println("INVALID RANGE");
		}
	}
		
}
