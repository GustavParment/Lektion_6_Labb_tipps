package demo.Gustav.com;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instance

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        //variables
        String player1;
        String player2;
        int die;
        int rounds = 5;
        int player1sum = 0;
        int player2sum = 0;  //Todo - number of dices

        // player1 - name
        System.out.println("input player1: ");
        player1 = sc.nextLine();
        System.out.println("Player1's name is: " + player1);
        //player2 - name
        System.out.println("input player2: ");
        player2 = sc.nextLine();
        System.out.println("Player2's name is: " + player2);


        // // // // // //
        // Game Logic //
        // // // // //

        /* Todo- Each Round?
         *   Each Player -> ThroeDice()

         * */
        //Player1 turn
        System.out.println(player1 + " is throwing!");
        for (int i = 0; i < rounds; i++) {

            // Dice
            die = random.nextInt(6) + 1;
            System.out.println(die);//Throw Dice

            player1sum += die;// New value each time??
            System.out.println("Sum is: " + player1sum);

        }
        //player 2 turn
        System.out.println(player2 + " is throwing!");
        for (int i = 0; i < rounds; i++) {

            // Dice
            die = random.nextInt(6) + 1;
            System.out.println(die);//Throw Dice

            player2sum += die;// New value each time??
            System.out.println("Sum is: " + player2sum);

        }

        System.out.println( player1 + " score: " + player1sum);
        System.out.println(player2 + " score: " + player2sum);







    }
}
