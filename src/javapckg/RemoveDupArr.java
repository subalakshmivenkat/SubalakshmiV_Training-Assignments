package javapckg;
import java.util.*;

public class RemoveDupArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedHashSet<Integer> s=new LinkedHashSet<>();
        for(int i=0;i<n;i++) s.add(sc.nextInt());
        for(int x:s) System.out.print(x+" ");
    }
}
