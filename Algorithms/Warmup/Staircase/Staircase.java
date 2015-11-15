import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String res = "";
        for(int i=1; i<=n; i++){
            for(int j=0; j<n-i; j++){
                res += " ";
            }
            for(int j=0; j<i; j++){
                res += "#";
            }
            System.out.println(res);
            res = "";
        }
    }
}