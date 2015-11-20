import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        //main loop
        for(int i=0; i<T; i++){
            int N = in.nextInt();
            int K = in.nextInt();
            for(int j=0; j<N; j++){
                if(in.nextInt() <= 0){
                    K--;
                }
            }
            if(K>0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}