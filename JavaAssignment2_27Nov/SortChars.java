package javapckg;
import java.util.*;

public class SortChars {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] c=s.toCharArray();
        Arrays.sort(c);
        System.out.println(new String(c));
    }
}
