package Exersice;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearlyPrice = Integer.parseInt(scanner.nextLine());

        double shoesPrice = yearlyPrice * 0.6;
        double clothesPrice = shoesPrice * 0.8;
        double ballPrice = clothesPrice / 4;
        double accessoriesPrice = ballPrice / 5;

        double totalPrice = yearlyPrice + shoesPrice + clothesPrice + ballPrice + accessoriesPrice;

        System.out.println(totalPrice);
    }
}
