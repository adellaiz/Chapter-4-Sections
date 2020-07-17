/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-17 07:13:44
 * @modify date 2020-07-17 07:13:44
 * @desc [(Geometry: area of a pentagon) Write a program that prompts the user to enter
the length from the center of a pentagon to a vertex and computes the area of the
pentagon]
 */
package src;
import java.util.Scanner;
public class Section_4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex = ");
        double r = input.nextDouble();
        double s = 2 * r * Math.sin(Math.PI/5);
        double area = (5 * Math.pow(s, 2))/(4 * Math.tan(Math.PI/5));
        System.out.println("The area of the pentagon = " + area);
    }
}