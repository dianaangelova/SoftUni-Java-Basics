package Exersice;

import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // declare radians
        double radians = Double.parseDouble(scanner.nextLine());

        // calculate radians to degrees
        double degrees = radians * 180/Math.PI;

        //print result in degrees
        System.out.println(degrees);

    }
}
