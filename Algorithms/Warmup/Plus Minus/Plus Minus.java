import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double posCount = 0;
        double negCount = 0;
        double zeroCount = 0;
        for(int i=0; i<n; i++){
            int k = in.nextInt();
            if(k < 0){
                negCount++;
            }else if(k > 0){
                posCount++;
            }else{
                zeroCount++;
            }
        }
        System.out.printf("%.4f%n", posCount/n);
        System.out.printf("%.4f%n", negCount/n);
        System.out.printf("%.4f%n", zeroCount/n);
    }
}