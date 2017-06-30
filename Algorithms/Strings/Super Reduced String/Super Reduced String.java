import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String super_reduced_string(String s){
        StringBuilder str = new StringBuilder(s);
        boolean pairFound = false;
        do{
            pairFound = false;
            for(int i=0; i<str.length()-1; i++){
                if(str.charAt(i) == str.charAt(i+1)){
                    str.deleteCharAt(i);
                    str.deleteCharAt(i);
                    pairFound = true;
                    break;
                }
            }
        }while(pairFound);
        String res = str.toString();
        if(res.isEmpty()){
            return "Empty String";
        }
        return str.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}
