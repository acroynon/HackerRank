import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        String res = "";
        for(int i=0; i<n; i++){
            list.add(in.nextInt());
        }
        for(int i=list.size()-1; i>=0; i--){
            res += list.get(i) + " ";
        }
        System.out.println(res);
    }
}