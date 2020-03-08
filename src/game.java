import java.util.Scanner;
import java.util.ArrayList;

public class game {
  private static final String STARTER_PROMPT = "Hello! Welcome to College Crusade. This game will help you keep track of everything you accomplished during the day. At the end of the game, we'll print your mental health, social, financial and academic score. Good luck! Press enter to start";

  private boolean check = false;
  private int money;
  private int studying;
  private int mental_health;
  private int social;
  public static Scanner sc;


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
      sc = new Scanner(System.in);
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
  //return user's input as int
  public static int getChoice(){
    sc = new Scanner(System.in);
    int choice = sc.nextInt(); //storing the users choice
    return choice;

  }

    public static void main(String[] args) {
      sc = new Scanner(System.in);
      System.out.println(STARTER_PROMPT);
      check();
      int userChoice = 0;
      int endingType = 0;

      Card card = null;
      //gameSetup();
      while(!gs.gameOver()){
          if(gs.hasEvent()){
              //do event
          }

          card = cards.getNextCard(card,userChoice);
          card.show_card();
          userChoice = getChoice();
          gs.updateGameState(userChoice, card);
          //state machine for any kind of update to game state??
        }

        gameEnding(gs.getEndingType());
      }
}
