public class Game {


    public static ArrayList<Card> cards;

    public void game(){
        boolean gameOVer = false;

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
