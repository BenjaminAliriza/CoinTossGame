package coinTossGame;

import java.util.Random;

public  class Coin {
    private String side = "Please flip the coin.";
    public String getSide(){
        return side;
    }
    public String heads = "heads";
    public String tails = "tails";

    public void flip(){

        Random random = new Random();

        if (random.nextBoolean()==true){
            side = heads;
        }else {
            side = tails;
        }


    }



}
