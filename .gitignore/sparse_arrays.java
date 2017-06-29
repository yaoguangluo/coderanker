import java.io.*;
import java.util.*;
public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number_of_strings = sc.nextInt();
        Map<String,Integer> strings = new HashMap<String,Integer>();
        if(number_of_strings<=1000 && number_of_strings>=1)
            do_read_string(strings,sc,number_of_strings);
        int number_of_querys = sc.nextInt();
        if(number_of_querys<=1000 && number_of_querys>=1)
            do_read_query(strings,sc,number_of_querys);
    }
    private static void do_read_string(Map<String,Integer> strings,Scanner sc,int number_of_strings)
    {
        for(int i=0;i<=number_of_strings;i++)
        {
            // System.out.println("i"+i);
            String string = sc.nextLine();

            if (string.length() <= 20 && string.length() > 0)
            {
               do_compare(strings, string);
            }else
            {
                //   i+=1;

            }

            //System.out.println(string);

        }
    }

    private static void do_read_query(Map<String,Integer> strings,Scanner sc,int number_of_querys)
    {
        for(int i=0;i<=number_of_querys;i++)
        {
            String query = sc.nextLine();
            if (query.length() <= 20 && query.length() > 0)
            {
                 do_find(strings, query);
            }else {
              // i+=1;
            }
        }
    }
    private static void do_compare(Map<String,Integer> strings,String string)
    {

        if(strings.containsKey(string))
        {
            // System.out.println(0);
            int temp= strings.get(string);
            temp+=1;
            strings.put(string,temp);
            // System.out.println(string);
            // System.out.println(2);
        }else{
            // System.out.println(1);
            strings.put(string,1);
        }
    }
    private static void do_find(Map<String,Integer> strings,String query)
    {
        if(strings.containsKey(query))
        {
            System.out.println(strings.get(query));
           // strings.remove(query);
        }else{
            System.out.println(0);
        }
    }
}
