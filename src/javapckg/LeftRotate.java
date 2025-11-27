package javapckg;
import java.util.*;

public class LeftRotate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int k=sc.nextInt();
        k%=n;
        int[] b=new int[n];
        for(int i=0;i<n;i++) b[i]=a[(i+k)%n];
        for(int x:b) System.out.print(x+" ");
    }
}
