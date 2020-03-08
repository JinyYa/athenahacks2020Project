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

    public void game(){
      this.money = 5;
      this.studying = 5;
      this.mental_health = 5;
      this.social = 5;
    }

    public String printcard(){
      String prompt = "y?";
      System.out.println(prompt);
      return prompt;
    }

    public boolean check() {
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

    public static void main(String[] args) {

      System.out.println(STARTER_PROMPT);
      game obj = new game(); //creates a new object
      if (obj.check() == false) {
        return;
      }
       else {
         obj.printcard();
       }




    }





}
