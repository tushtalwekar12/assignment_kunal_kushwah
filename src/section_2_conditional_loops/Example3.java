package section_2_conditional_loops;
//  Area Of Isosceles Triangle : area = (base * height) / 2
// height =  Math.sqrt(Math.pow(side, 2) - Math.pow(base / 2, 2)

import java.util.*;
public class Example3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input base
        System.out.println("enter the value of base :");
        double base = sc.nextDouble();

        // input side
        System.out.println("enter the value of side : ");
        double side = sc.nextDouble();

        // calculate height
        double height = Math.sqrt(Math.pow(side,2) - Math.pow(base /2 , 2));
        System.out.println("the height is : "+ height);

        // area of Isosceles
        double area = (base * height) / 2;

        System.out.println("area of Isosceles : "+ area);
    }
}
