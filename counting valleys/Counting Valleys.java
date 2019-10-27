import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int level = 1;
        int valleys = 0;

        String str = in.next();
        for(int i = 0; i < n; i++) {
            char c = str.charAt(i);
            if(c == 'U'){
                if(level < 1 && (level+1) == 1) {
                    valleys++;
                }
                level++;
            }else{
                level--;
            }

        }
        System.out.println(valleys);
    }
}