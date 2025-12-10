package javapckg;
import java.util.*;

public class CountTypes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int d=0,a=0,sp=0;
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)) d++;
            else if(Character.isLetter(c)) a++;
            else sp++;
        }
        System.out.println(a+" "+d+" "+sp);
    }
}
