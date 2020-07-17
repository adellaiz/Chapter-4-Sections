/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-17 07:14:13
 * @modify date 2020-07-17 07:33:03
 * @desc [(Geometry: great circle distance) The great circle distance is the distance between
two points on the surface of a sphere. Let (x1, y1) and (x2, y2) be the geographical latitude and longitude of two points.
Write a program that prompts the user to enter the latitude and longitude of two
points on the earth in degrees and displays its great circle distance. The average
earth radius is 6,371.01 km. Note that you need to convert the degrees into radians
using the Math.toRadians method since the Java trigonometric methods use
radians. The latitude and longitude degrees in the formula are for north and west.
Use negative to indicate south and east degrees.]
 */
package src;
import java.util.Scanner;
public class Secttion_4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter point 1 (latitude and longitude) in degrees = ");
        double x1 = input.nextDouble();
        double r1 = Math.toRadians(x1);
        double y1 = input.nextDouble();
        double r2 = Math.toRadians(y1);
        System.out.print("Enter point 2 (latitude and longitude) in degrees = ");
        double x2 = input.nextDouble();
        double r3 = Math.toRadians(x2);
        double y2 = input.nextDouble();
        double r4 = Math.toRadians(y2);
        final double radius = 6371.01;
        double d = radius * (Math.acos((Math.sin(r1) * Math.sin(r3)) + (Math.cos(r1) * Math.cos(r3) * Math.cos(r2 - r4))));
        System.out.println("The distance between the two points is = "+ d + " km");
    }
}