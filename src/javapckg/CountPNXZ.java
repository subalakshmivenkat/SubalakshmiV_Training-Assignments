package javapckg;
import java.util.*;

public class CountPNXZ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=0,ng=0,z=0;
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            if(x>0)p++; else if(x<0)ng++; else z++;
        }
        System.out.println(p+" "+ng+" "+z);
    }
}
