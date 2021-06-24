package com.company.practice;

import java.util.Scanner;

public class ATM {
    public static int balance = 100000;

    public static void printMenu() {
        System.out.println("____________________");
        System.out.println("      ATM Menu    ");
        System.out.println();
        System.out.println("1. Cash withdrawal");
        System.out.println("2. Check my balance");
        System.out.println("4. Quit");
        System.out.println();
        System.out.println("  Choose an option:   ");
        System.out.println("____________________");
    }


    public static void withdrawCash() {
        System.out.println("Type the amount of cash you want to withdraw: ");
        Scanner scan = new Scanner(System.in);
        int amountOfMoneyRequested = scan.nextInt();
        if (balance > amountOfMoneyRequested) {
            System.out.println("Withdraw your cash: " + amountOfMoneyRequested);
        }
        balance = balance - amountOfMoneyRequested;
    }


    public static void checkBalance() {
        System.out.println("Your balance: " + balance);
    }

    public static void main(String[] args) {
        printMenu();
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
            int menuOption = scan.nextInt();
            if (menuOption == 1) withdrawCash();
            else if (menuOption == 2) checkBalance();
            else if (menuOption == 4) break;
            System.out.println();
            System.out.println("Press 3 to go back to the menu: ");
            int backToTheMenu = scan.nextInt();
            if (backToTheMenu == 3) {
                printMenu();
            }
            int secondMenuOption = scan.nextInt();
            if (secondMenuOption == 1) {
                withdrawCash();
            } else if (secondMenuOption == 2)
                checkBalance();
            System.out.println();
            System.out.println("Press 3 to go back to the menu: ");
            int anotherBackToTheMenu = scan.nextInt();
            if (anotherBackToTheMenu == 3) {
                printMenu();
            }
            int quitOption = scan.nextInt();
            if (quitOption == 4)
                break;
        }
    }
}





