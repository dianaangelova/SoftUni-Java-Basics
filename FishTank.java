package Exersice;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Дължина in cm
        int length = Integer.parseInt(scanner.nextLine());
        //Ширина in cm
        int width = Integer.parseInt(scanner.nextLine());
        //Видочина in cm
        int height = Integer.parseInt(scanner.nextLine());

        double percentage = Double.parseDouble(scanner.nextLine());

        double volumeAll = length*0.1 * width *0.1* height * 0.1;
        double volumeWater = volumeAll - volumeAll*percentage/100;

        System.out.println(volumeWater);
    }
}
