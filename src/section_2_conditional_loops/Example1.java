package section_2_conditional_loops;
//problem-1 - Area Of Circle Java Program : formula : πr².
import java.util.*;
public class Example1 {
    public static void main(String[] args) {
        // get radius to user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        double radius = sc.nextDouble();

        //double r = 12.2;

        // calculate area
        //double area = Math.PI * Math.pow(radius,2);
        // or
        double area1 = Math.PI * radius * radius;
        System.out.println("the radius of circle : "+ area1);
    }

}
