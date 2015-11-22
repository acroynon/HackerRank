import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int T = in.nextInt();
        int width[] = new int[N];
        for(int i=0; i< N; i++){
            width[i] = in.nextInt();
        }
        for(int k=0; k<T; k++){
            int i = in.nextInt();
            int j = in.nextInt();
            int res = 3;
            for(int g=i; g<=j; g++){
                if(res > width[g]){
                    res = width[g];
                }
            }
            System.out.println(res);
        }
    }
}