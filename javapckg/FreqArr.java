package javapckg;
import java.util.*;

public class FreqArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        Map<Integer,Integer> m=new HashMap<>();
        for(int x:a) m.put(x,m.getOrDefault(x,0)+1);
        for(int x:m.keySet()) System.out.println(x+" "+m.get(x));
    }
}
