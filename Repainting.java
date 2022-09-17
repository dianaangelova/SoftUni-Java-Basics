package Exersice;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int plastic = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int diluent = Integer.parseInt(scanner.nextLine());
        int hoursWork = Integer.parseInt(scanner.nextLine());

        double suppliesTotalPrice= plastic*1.50+paint*14.50+diluent*5.00;
        double addToPrice = paint*14.50*10/100 + 2*1.50 +0.40;
        double payToWorkMan = hoursWork*(suppliesTotalPrice+addToPrice)*30/100;
        double totalPrice = suppliesTotalPrice+addToPrice+payToWorkMan;

        System.out.println (totalPrice);

    }
}
