package coinTossGame;

import java.security.PublicKey;
import java.util.Random;

public  class Coin {

    private String side;

    String heads = "Heads!";
    String tails = "Tails!";

    public boolean flip(){

        Random random = new Random();

        return random.nextBoolean();


    }



}
