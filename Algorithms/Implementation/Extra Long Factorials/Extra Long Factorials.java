import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        BigDecimal res = new BigDecimal(n);
        for(int i=Integer.parseInt(n)-1; i>0; i--){
            res = res.multiply(new BigDecimal(i));
        }
        System.out.print(res);
    }
}