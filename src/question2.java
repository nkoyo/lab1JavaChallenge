import java.util.Scanner;
import java.util.Arrays;

public class question2 {
    public static void main(String[] args) {
        System.out.print("Please type your string: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();
        int len = str.length();

        StringBuilder builder = new StringBuilder(); // a tool that is used to make strings from characters, integers, etc.
        for(int i = len - 1; i >= 0; i--){ // reverse the initial string indices such that the last character in the original string is the first character in the new string
            builder.append(str.charAt(i));
        }
        System.out.println(builder.toString());
    }
}
