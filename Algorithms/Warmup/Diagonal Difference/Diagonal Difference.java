import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d1 = 0;
        int d2 = 0;
        int d1c = 0;
        int d2c = n-1;
        int ld2 = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int k = in.nextInt();
                if(j+(i*n) == d1c){
                    d1 += k;
                    d1c += n+1;
                }
                if(j+(i*n) == d2c){
                    d2 += k;
                    d2c += n-1;
                    ld2 = k;
                }
            }
        }
        d2 += ld2 * -1;
        System.out.println(Math.abs(d2-d1));
    }
}