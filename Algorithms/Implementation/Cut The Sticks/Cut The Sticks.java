import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		ArrayList<Integer> lengths = new ArrayList<Integer>();
		
		for(int i=0; i<N; i++){			lengths.add(in.nextInt());
		}
		
		while(lengths.size() > 0){
			System.out.println(lengths.size());
			int shortestLength = lengths.get(0);
			//determine the shortest stick length
			for(int len : lengths){
				if(len < shortestLength){
					shortestLength = len;
				}
			}
			//cut the sticks, and remove below 0 lengths
			for(int i=0; i< lengths.size(); i++){
				lengths.set(i, lengths.get(i) - shortestLength);
				if(lengths.get(i) <= 0){
					lengths.remove(i);
					i--;
				}
				
			}
		}
	}
}
