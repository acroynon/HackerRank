import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        char[] message = new char[]{'S','O','S'};
        int ind = 0;
        int count = 0;
        for(int i = 0; i<S.length(); i++){
            if(S.charAt(i) != message[ind]){
                count++;
            }
            ind = (ind+1) % message.length;
        }
        System.out.println(count);
    }
}
