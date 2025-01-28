package section_2_conditional_loops;
//  Area Of Rectangle Program -  area = length * width
import java.util.*;
public class Example4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take length
        System.out.println("enter the length of rectangle :");
        double length = sc.nextDouble();

        // take width
        System.out.println("enter the value of width :");
        double width = sc.nextDouble();

        // calculate area
        double area = length * width;

        System.out.print("area of reactangle : "+ area);
    }
}
