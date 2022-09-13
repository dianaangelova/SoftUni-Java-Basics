package Exersice;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double depositSum = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double interestPerYear = Double.parseDouble(scanner.nextLine());

        //   сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)

        double interestPerMonth = (depositSum) * interestPerYear/100 / 12;
        double totalSum = depositSum + (months * interestPerMonth);

        System.out.println(totalSum);
    }
}
