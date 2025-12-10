package colpg;

import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, String> tm = new TreeMap<>();

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int key = sc.nextInt();
            String value = sc.next();
            tm.put(key, value);
        }

        System.out.println(tm);

        System.out.println(tm.descendingMap());
    }
}
