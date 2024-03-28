//package machine;
//
//import java.util.Scanner;
//
//public class CoffeeMachine {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int count = 0;
//
//        while (true) {
//
//            System.out.println("Write Action (buy, fill, take, remaining, exit)");
//            String action = scanner.nextLine();
//
//            count += 1;
//
//            if (action.equals("buy")) {
//                if (count > 1) {
//                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back-to main menu");
//                } else {
//                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
//                }
//                String orderOption = scanner.nextLine();
//                Buy(orderOption);
//            } else if (action.equals("fill")) {
//                System.out.println("Write how many ml of water you want to add:");
//                int waterRequired = scanner.nextInt();
//                System.out.println("Write how many ml of milk you want to add:");
//                int milkRequired = scanner.nextInt();
//                System.out.println("Write how many g of coffee beans you want to add:");
//                int coffeeRequired = scanner.nextInt();
//                System.out.println("Write how many disposable cups you want to add:");
//                int cupsRequired = scanner.nextInt();
//                fill(waterRequired, milkRequired, coffeeRequired, cupsRequired);
//            } else if (action.equals("remaining")) {
//                remaining();
//            } else if (action.equals("exit")) {
//                break;
//            } else if (action.equals("take")) {
//                take();
//            } else if (action.equals("Back")) {
//                continue;
//            } else {
//                continue;
//            }
//        }
//
//    }
//
//    static int intialAmountOfWater = 400;
//    static int intialAmountofMilk = 540;
//    static int intialAmountofCoffeBeans = 120;
//    static int intialAmountOfCups = 9;
//    static int intialAmountOfMoney = 550;
//
//    public static void Buy(String CoffeeType) {
//        if (CoffeeType.equals("1")) {
//            checkEspresso();
//        } else if (CoffeeType.equals("2")) {
//            checkLatte();
//        } else if (CoffeeType.equals("3")) {
//            checkCappunicino();
//        } else {
//            System.out.println("Invalid input. Enter a number");
//        }
//    }
//
//    public static void fill(int water, int milk, int coffee, int cups) {
//        intialAmountOfWater += water;
//        intialAmountofMilk += milk;
//        intialAmountofCoffeBeans += coffee;
//        intialAmountOfCups += cups;
//        intialAmountOfMoney += 0;
//    }
//
//    public static void take() {
//        System.out.println("I gave you " + (intialAmountOfMoney));
//        intialAmountOfMoney -= intialAmountOfMoney;
//    }
//
//    public static void remaining() {
//        System.out.println("This coffee machine has:");
//        System.out.println((intialAmountOfWater) + " ml of water");
//        System.out.println((intialAmountofMilk) + " ml of milk");
//        System.out.println((intialAmountofCoffeBeans) + " g of coffee beans");
//        System.out.println((intialAmountOfCups) + " disposable cups");
//        System.out.println("$" + (intialAmountOfMoney) + " of money");
//    }
//
//    public static void checkEspresso() {
//        if (intialAmountOfWater < 250) {
//            System.out.println("Sorry, not enough water!");
//        } else if (intialAmountofCoffeBeans < 16) {
//            System.out.println("Sorry, not enough coffee!");
//        } else {
//            System.out.println("I have enough resources, making you a coffee");
//            intialAmountOfWater -= 250;
//            intialAmountofCoffeBeans -= 16;
//            intialAmountOfCups -= 1;
//            intialAmountOfMoney += 4;
//        }
//    }
//
//    public static void checkLatte() {
//        if (intialAmountOfWater < 350) {
//            System.out.println("Sorry, not enough water!");
//        } else if (intialAmountofMilk < 75) {
//            System.out.println("Sorry, not enough milk!");
//        } else if (intialAmountofCoffeBeans < 20) {
//            System.out.println("Sorry, not enough coffee!");
//        } else {
//            System.out.println("I have enough resources, making you a coffee");
//            intialAmountOfWater -= 350;
//            intialAmountofMilk -= 75;
//            intialAmountofCoffeBeans -= 20;
//            intialAmountOfCups -= 1;
//            intialAmountOfMoney += 7;
//        }
//    }
//
//    public static void checkCappunicino() {
//        if (intialAmountOfWater < 350) {
//            System.out.println("Sorry, not enough water!");
//        } else if (intialAmountofMilk < 75) {
//            System.out.println("Sorry, not enough milk!");
//        } else if (intialAmountofCoffeBeans < 20) {
//            System.out.println("Sorry, not enough coffee!");
//        } else {
//            System.out.println("I have enough resources, making you a coffee");
//            intialAmountOfWater -= 200;
//            intialAmountofMilk -= 100;
//            intialAmountofCoffeBeans -= 12;
//            intialAmountOfCups -= 1;
//            intialAmountOfMoney += 6;
//        }
//    }
//
//
//}
//

package machine;

import java.util.Scanner;

public class CoffeeMachine {


}



