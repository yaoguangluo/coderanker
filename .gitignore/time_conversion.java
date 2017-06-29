import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
      try{
        DateFormat formatter = new SimpleDateFormat("hh:mm:ssa");
        DateFormat formatter1 = new SimpleDateFormat("HH:mm:ss");
       Date fajr_begins = (Date)formatter.parse(time);
        System.out.println( formatter1.format(fajr_begins));
      }catch(Exception e){}
        
        
        
    }
}
