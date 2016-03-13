import java.util.Scanner;


public class Solution {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		in.nextLine();
		String[] list = new String[N];
		for(int i=0; i<N; i++){
			list[i] = in.nextLine();
		}
		
		int maxTopics = 0;
		int maxGroups = 0;
		
		//for every string
		for(int i=0; i<N; i++){
			//for every string after the ith string
			for(int j=i+1; j<N; j++){
				int score = 0;
				//check every character
				for(int k=0; k<M; k++){
					score += (list[i].charAt(k) == '1' ^ list[j].charAt(k) == '1' || list[i].charAt(k) == '1' && list[j].charAt(k) == '1')?1:0;  
				}
				if(score > maxTopics){
					maxTopics = score;
					maxGroups = 1;
				}else if (score == maxTopics){
					maxGroups++;
				}
			}
		}
		System.out.println(maxTopics);
		System.out.println(maxGroups);
		
	}
			
	

}
