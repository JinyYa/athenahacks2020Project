import java.util.Scanner;
import java.util.ArrayList;

public class game {
  private static final String STARTER_PROMPT = "Hello! Welcome to College Crusade. This game will help you keep track of everything you accomplished during the day. At the end of the game, we'll print your mental health, social, financial and academic score. Good luck! Press enter to start";

  private boolean check = false;
  private int money;
  private int studying;
  private int mental_health;
  private int social;

    public static CardQueue cards;
    public static GameState gs;

    public void study(){
      String prompt = "Did you study today?";
      // Scanner sc = new Scanner(System.in);
      // String readString = sc.nextLine();
      //
      System.out.println(prompt);
      // return prompt;
    }

    public static boolean check() {
      Scanner sc = new Scanner(System.in);
      String readString = sc.nextLine();
      System.out.println(readString);
      if (readString.equals("")) { //checks if the user pressed enter
        return true;
      }
      else {
        System.out.println("it didn't work");
        return true;
      }
    }
  public static void gameEnding(int endingType){

  }
  public static int getChoice(){

  }

    public static void main(String[] args) {

      System.out.println(STARTER_PROMPT);
      check();
      int userChoice = 0;
      int endingType = 0;


      boolean gameOver = false;
      Card card = null;
      //gameSetup();
      while(!gameOver){
//          if(gs.hasEvent()){
//          }
          card = cards.getNextCard(card,userChoice);
          card.show_card();
          userChoice = getChoice();
          gs.swipe(userChoice, card);
          //state machine for any kind of update to game state??
        }

        gameEnding(endingType);
      }












}
