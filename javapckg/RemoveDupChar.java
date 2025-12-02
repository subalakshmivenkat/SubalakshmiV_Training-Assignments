package javapckg;
import java.util.*;

public class RemoveDupChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        LinkedHashSet<Character> set=new LinkedHashSet<>();
        for(char c:s.toCharArray()) set.add(c);
        for(char c:set) System.out.print(c);
    }
}
