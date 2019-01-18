import java.util.Scanner;

public class question3 {
    // helper method to compute the area
    public static double areaOfCircle(double r){
        return Math.PI * r * r;
    }
    // helper method to compute the circumference
    public static double circumCircle(double r){
        return 2 * Math.PI * r;
    }
    public static void main(String[] args) {
        System.out.print("Please enter your radius: ");
        Scanner scan = new Scanner(System.in);
        double radius = scan.nextInt();
        scan.close();

        double area = areaOfCircle(radius);
        double circumference = circumCircle(radius);

        System.out.printf("The area of the circle is %.2f square units, and the circumference" +
                " is %.2f units.\n", area, circumference);
    }
}
