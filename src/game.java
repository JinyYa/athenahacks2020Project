import java.util.Scanner;

public class Game {


    public static CardQueue cards;
    public static GameState gs;

    public void game(){
        boolean gameOver = false;
        Scanneer sc = new Scanner();



        gameSetup();

        while(!gameOver){


            if(event){

            }

            show_card();

            swipe();

            //state machine for any kind of update to game state??


        }

        gameEnding(endingType);
    }





}
