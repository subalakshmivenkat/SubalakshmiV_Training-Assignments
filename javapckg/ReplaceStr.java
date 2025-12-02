package javapckg;
import java.util.*;

public class ReplaceStr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String old=sc.nextLine();
        String nw=sc.nextLine();
        System.out.println(s.replace(old,nw));
    }
}
