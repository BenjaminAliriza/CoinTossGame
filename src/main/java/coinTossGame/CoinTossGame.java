package coinTossGame;

import java.util.Scanner;

public class CoinTossGame {

    static Player player1 = new Player();
    static Player player2 = new Player();
    static Coin coin = new Coin();

    public static void main(String[] args) {

        registerPlayer();
        takePlayerGuess();
        flipThatCoin();

    }

    public static void registerPlayer(){


        Scanner scanner = new Scanner(System.in);

        for (int b = 1; b <= 2; b++) {


            if(b == 1 ){

                System.out.println("Hello player 1, what is your name?");
                player1.setName(scanner.next());
                System.out.println("Thank you," + player1.getName() +"\n");

            }else {

                System.out.println("Hello player 2, what is your name?");
                player2.setName(scanner.next());
                System.out.println("Thank you," + player2.getName()+"\n");
            }

        }
    }

    public static void takePlayerGuess(){

        Coin coin = new Coin();
        Scanner scanner = new Scanner(System.in);

         for (int b = 3; b > 0; b--) {
             System.out.println(player1.getName()+", guess what side the coin will land.");

             String guess = scanner.next().toLowerCase();

             if(guess.equals("heads") || guess.equals("tails")) {

                player1.setGuess(guess);

                    if (player1.getGuess().equals(coin.heads)) {
                        player2.setGuess(coin.tails);
                        break;
                    } else if (player1.getGuess().equals(coin.tails)) {
                        player2.setGuess(coin.heads);
                        break;
                    }

            }else {
                 System.out.println("You seem to have misspelled either 'heads' or 'tails'." +
                         "\nYou've got exactly " + b + " tries left" +
                         "\nPlease try again.");
             }
        }
        System.out.println(player1.getName()+", your official guess is "+player1.getGuess()+
            ".\nThat means that "+player2.getName()+" is betting on " + player2.getGuess()+"." +
                "\nMay the odds, be ever in your favour.");
    }

    public static void flipThatCoin() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("It's time to flip the coin. Ready?");
        String answer = scanner.next().toLowerCase();


            if (answer.equals("yes")) {

                System.out.println("Here we go! :D");
                coin.flip();

            } else  {

                System.out.println("Don't know what that means... but here we go! :P\n*FLICKS COIN*");
                coin.flip();
            }

            System.out.println("Let's see what we got.\nIt would seem the result is " + coin.getSide());

            if (coin.getSide().equals(player1.getGuess())) {
                System.out.println("Congratulations " + player1.getName() + "!!! You've won!!!");
            } else {
                System.out.println("Congratulations " + player2.getName() + "!!! You've won!!!");
            }

    }
}
