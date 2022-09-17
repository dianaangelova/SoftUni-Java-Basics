package Exersice;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int numberPens=Integer.parseInt(scanner.nextLine());
        int numberMarker=Integer.parseInt(scanner.nextLine());
        int numberLiters=Integer.parseInt(scanner.nextLine());
        int discountPercent=Integer.parseInt(scanner.nextLine());

        double totalBeforeDiscount = numberPens*5.80+numberMarker*7.20+numberLiters*1.20;
        double discount =totalBeforeDiscount*discountPercent/100;
        double totalAfterDiscount =totalBeforeDiscount-discount;

        System.out.println(totalAfterDiscount);
    }
}
