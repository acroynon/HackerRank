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
            boolean spring = true;
            int len = 1;
            int N = in.nextInt();
            for(int j=0; j<N; j++){
                if(spring){
                    len *= 2;
                }else{
                    len++;
                }
                spring = !spring;
            }
            System.out.println(len);            
        }
    }
}