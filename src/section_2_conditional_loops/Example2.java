package section_2_conditional_loops;
// Area Of Triangle : Calculate the area of the triangle (0.5 * base * height)
import java.util.*;
public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input base
        System.out.println("enter the value of base :");
        double base = sc.nextDouble();

        // input height
        System.out.println("enter the value of height : ");
        double height = sc.nextDouble();

        // calculate area
        double area = (0.5 * base * height);

        //print area
        System.out.println("area of tringle : "+ area);
    }
}
