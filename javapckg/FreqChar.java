package javapckg;
import java.util.*;

public class FreqChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char c=sc.next().charAt(0);
        int cnt=0;
        for(char ch:s.toCharArray()) if(ch==c) cnt++;
        System.out.println(cnt);
    }
}
