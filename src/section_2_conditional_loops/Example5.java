package section_2_conditional_loops;
// Area Of Parallelogram : formula : Area=Base×Height
import java.util.*;
public class Example5 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        // take base
        System.out.println("enter the value of base :");
        double base = Input.nextDouble();

        // take height
        System.out.println("enter the value of height :");
        double height = Input.nextDouble();

        // calculate the area of parallelogram
        double area  = base * height;

        System.out.println("area of Parallelogram : "+ area);
    }
}
