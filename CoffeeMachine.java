package machine;

import java.util.Scanner;

public class CoffeeMachine {

    private static final Scanner scanner = new Scanner(System.in);
    private static int water = 400;
    private static int milk = 540;
    private static int coffeeBeans = 120;
    private static int cups = 9;
    private static int money = 550;

    public static void printResources() {
        System.out.println("The coffee machine has");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffeeBeans + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + money + " of money");
        System.out.println();
    }

    public static void buyCappuccino() {
        processDrink(200, 100, 12, 6);
    }

    public static void buyLatte() {
        processDrink(350, 75, 20, 7);
    }

    public static void buyEspresso() {
        processDrink(250, 0, 16, 4);
    }

    public static void processDrink(int waterPerCup, int milkPerCup, int coffeeBeansPerCup, int moneyTaken) {

        if (water < waterPerCup) {
            System.out.println("Sorry, not enough water!");
        } else if (milk < milkPerCup) {
            System.out.println("Sorry, not enough milk!");
        } else if (coffeeBeans < coffeeBeansPerCup) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (cups < 1) {
            System.out.println("Sorry, not enough disposable cups!");
        } else {
            water -= waterPerCup;
            milk -= milkPerCup;
            coffeeBeans -= coffeeBeansPerCup;
            money += moneyTaken;
            cups--;
            System.out.println("I have enough resources, making you a coffee!");
        }

        System.out.println();
    }

    public static void Buy(int coffeeType) {
        switch (coffeeType) {
            case 1:
                buyEspresso();
                break;
            case 2:
                buyLatte();
                break;
            case 3:
                buyCappuccino();
                break;
            default:
                break;
        }
    }

    public static void fillResources() {
        int waterAdded = getWater();
        int milkAdded = getMilk();
        int coffeeAdded = getCoffee();
        int cupsAdded = getCups();

        water += waterAdded;
        milk += milkAdded;
        coffeeBeans += coffeeAdded;
        cups += cupsAdded;

        System.out.println();

    }

    public static void takeMoney() {

        System.out.println("I gave you $" + money);
        money = 0;

        System.out.println();
    }

    public static int getCoffeeType() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino");
        return Integer.parseInt(scanner.nextLine());
    }

    public static int getWater() {
        System.out.println("Write how many ml of water you want to add: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public static int getMilk() {
        System.out.println("Write how many ml of milk you want to add: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public static int getCoffee() {
        System.out.println("Write how many grams of coffee beans you want to add:");
        return Integer.parseInt(scanner.nextLine());
    }

    public static int getCups() {
        System.out.println("Write how many disposable cups you want to add: ");
        return Integer.parseInt(scanner.nextLine());
    }


    public static void main(String[] args) {

        while (true) {

            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.nextLine();

            System.out.println();

            switch (action) {
                case "buy":
                    int coffeeType = getCoffeeType();
                    Buy(coffeeType);
                    break;
                case "fill":
                    fillResources();
                    break;
                case "take":
                    takeMoney();
                    break;
                case "remaining":
                    printResources();
                    break;
                case "exit":
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}



