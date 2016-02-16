import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        int firstNum, secondNum, cnt;
        double sqrt;
        for(int j=0; j< testCases; j++){
            firstNum = in.nextInt();
            secondNum = in.nextInt();
            cnt = 0;
            for(int i=firstNum; i<=secondNum; i++){
                sqrt = Math.sqrt(i);
                if(sqrt == (int)sqrt){
                    cnt += 1;
                    i += sqrt*2;
                }
            }
            System.out.println(cnt);
       }
    }
}
