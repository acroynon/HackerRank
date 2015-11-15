import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String timeIn = in.nextLine();
        if(timeIn.indexOf("AM") != -1){
            String hour = timeIn.substring(0,2);
            System.out.println((hour.equals("12")?"00":hour) + timeIn.substring(2, 8));
        }else{
            int newHour = new Integer(timeIn.substring(0,2)) + 12;
            if(newHour == 24){newHour = 0;}
            System.out.println((newHour==0?"12":newHour) + timeIn.substring(2,8));
        }
    }
}