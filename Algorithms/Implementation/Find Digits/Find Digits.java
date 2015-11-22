import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i=0; i<T; i++){
            int N = in.nextInt();
            int total = 0;
            String str = Integer.toString(N);
            char c = 'j';
            for(int j=0; j<str.length(); j++){
                    c = str.charAt(j);
                if(c == '0'){
                    continue;
                }else if(N %(Character.getNumericValue(c)) == 0){
                    total++;
                }
            }
            System.out.println(total);
            
        }
    }
}