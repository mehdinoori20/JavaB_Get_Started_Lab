package com.Mehdi.demo;

import java.util.Scanner;
import static com.Mehdi.demo.Colors.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Instantiate Objects
        Player player = new Player();

        System.out.println( GREEN + "Welcome Adventure" + RESET );
        System.out.println("What is your name?");
        player.setName( sc.nextLine() );

        System.out.println("Ah.. your name is: " + player.getName());

        // Menu
        do {
            System.out.println("""
                    1. Fight
                    2. Status
                    3. Exit Game
                     """);
            switch (sc.nextLine()) {
                case "1" -> fightMenu();
                case "2" -> player.getStatus();
                case "3" -> System.exit(0);

                default -> System.out.println("Try again!");
            }
        } while (true);
    }

    public static void fightMenu() {



        System.out.println("Inside another MENU");
        switch (sc.nextLine()) {
            case "1" -> System.out.println("Number #1");
            case "2" -> System.out.println("Number #2");

            default -> System.out.println("Try again");
        }



    }

}
