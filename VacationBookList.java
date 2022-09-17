package Exersice;

import java.util.Scanner;

public class VacationBookList {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int totalPages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int hoursPerDay = totalPages/pagesPerHour/days;

        System.out.println(hoursPerDay);

    }
}
