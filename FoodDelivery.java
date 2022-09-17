package Exersice;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberChickenM = Integer.parseInt(scanner.nextLine());
        int numberFishM = Integer.parseInt(scanner.nextLine());
        int numberVegeterM = Integer.parseInt(scanner.nextLine());

            //Пилешко меню –  10.35 лв.
            // Меню с риба – 12.40 лв.
            // Вегетарианско меню  – 8.15 лв.

        double orderedPrice = numberChickenM*10.35 + numberFishM*12.40+numberVegeterM*8.15;
        double dessertPrice = orderedPrice*0.2;
        double totalPrice = orderedPrice+dessertPrice+2.50;

        System.out.println(totalPrice);

    }
}
