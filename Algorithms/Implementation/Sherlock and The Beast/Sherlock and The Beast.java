import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int N;
        //main loop
        for(int i=0; i<T; i++){
            //divisble by 5
            int num3 = 0;
            //divisible by 5
            int num5 = 0;
            N = in.nextInt();
            if(N >= 3){
                num5 = (int) Math.floor(N/3);
                int remainder = N - (num5*3);
                if(remainder == 1){
                    num3+=2;
                    num5-=3;
                }else if(remainder ==2){
                    num5--;
                    num3++;
                }else if(remainder == 3){
                    num3++;
                }
                //if either is negative
                if(num3 <0 || num5 < 0){ num3 =0; num5 =0;}
            }
            //create result string
            String res = "";
            StringBuilder res3 = new StringBuilder(num5 * 3);
            StringBuilder res5 = new StringBuilder(num3 * 5);
            if(num3 ==0 && num5 == 0){
                System.out.println(-1);
            }else{
                 for(int k=0; k<num5; k++){
                     res5.append("555");
                 }
                 for(int k=0; k<num3; k++){
                    res3.append("33333");
                 }
                System.out.println(res5.append(res3));
            }
        }
    }
}