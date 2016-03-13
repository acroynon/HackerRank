import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Solution {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String msg = in.nextLine();
		int rows = (int) Math.floor(Math.sqrt(msg.length()));
		int cols = (int) Math.ceil(Math.sqrt(msg.length()));
		if(rows*(cols-1) < rows*cols){
			cols--;
		}
		List<String> strRows = new ArrayList<String>();
		
		int colCnt = 0;
		StringBuffer str = new StringBuffer();
		for(int i=0; i< msg.length(); i++){
			str.append(msg.charAt(i));
			colCnt++;
			if(colCnt > (cols)){
				strRows.add(str.toString());
				str.delete(0, str.length());
				colCnt = 0;
			}
		}
		strRows.add(str.toString());
		
		for(int i=0; i<strRows.get(0).length(); i++){
			for(int j=0; j<strRows.size(); j++){
				try{
					System.out.print(strRows.get(j).charAt(i));
				}catch(Exception e){
					//do nothing
				}
			}
			System.out.print(" ");
		}
		
		
	}
		
}
