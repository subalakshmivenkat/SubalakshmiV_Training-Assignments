package expckge;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PhoneValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phone = sc.nextLine();

        String regex = "^(\\+1|001)-\\d{3}-\\d{3}-\\d{4}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);

        if (matcher.matches()) {
            System.out.println("Valid phone number");
        } else {
            System.out.println("Invalid phone number");
        }
    }
}
