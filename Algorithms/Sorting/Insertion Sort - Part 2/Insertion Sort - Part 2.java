import java.util.ArrayList;
import java.util.Scanner;


public class Solution {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<s; i++){
			list.add(in.nextInt());
		}
		
		for(int i=1; i<s; i++){
			for(int j=i; j>0; j--){
				if(list.get(j) < list.get(j-1)){
					int temp = list.get(j);
					list.set(j, list.get(j-1));
					list.set(j-1, temp);
				}
			}
			
			for(int i1=0; i1<s; i1++){
				System.out.print(list.get(i1) + " ");
			}
			System.out.println();
		}
		
	}
	
}