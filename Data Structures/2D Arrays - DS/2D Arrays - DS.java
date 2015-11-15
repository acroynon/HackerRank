import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static ArrayList<Integer> list;    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        list = new ArrayList<Integer>();
        int largestSum = -63;
        int sum = 0;
        for(int i=0; i<36; i++){
            list.add(in.nextInt());
        }
        for(int i=7; i<=28; i++){
            if((i+1)%6 != 0 && i%6 !=0){
                sum = sumHourGlass(i);
                if(sum > largestSum){
                    largestSum = sum;
                }
            }
        }
        System.out.println(largestSum);
    }
    
    public static int sumHourGlass(int cenIndex){
        return list.get(cenIndex) + list.get(cenIndex-6) + list.get(cenIndex-7) + list.get(cenIndex-5) + list.get(cenIndex+5) + list.get(cenIndex+6) + list.get(cenIndex+7);
    }
}