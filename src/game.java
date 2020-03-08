import java.util.Scanner;

public class game {
  private static final String STARTER_PROMPT = "Hello! Welcome to College Crusade. This game will help you ask you to make a series of choices. At the end of the game, we'll print your mental health, social, financial and academic score. Good luck! Press enter to start";

  private boolean check = false;
  public static Scanner sc;


  public static CardQueue cards = new CardQueue();
  public static GameState gs = new GameState();

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
    System.out.println("ending: " + gs.getEndingType());

    System.out.println("Your final scores are: ");
    System.out.println("money: " + gs.getMoney());
    System.out.println("studying: " + gs.getStudying());
    System.out.println("mental health: " + gs.getMental_health());
    System.out.println("social: " + gs.getSocial());


  }
  //return user's input as int
  public static int getChoice(){
    sc = new Scanner(System.in);
    int choice = sc.nextInt(); //storing the users choice
    return choice-1;

  }

  public void game_demo(){
    //three card scenario,  use card queue

  }

    public static void main(String[] args) {
      gameSetup();
      sc = new Scanner(System.in);
      System.out.println(STARTER_PROMPT);
      check();
      int userChoice = 0;
      int endingType = 0;

      Card card = null;
      //gameSetup();
      while(!gs.gameOver()){
//          if(gs.hasEvent()){
//              //do event
//          }
  try {
    card = cards.getNextCard(card,userChoice);
  }
  catch(NullPointerException e){

  }


          if(card == null){
            //all cards used up!
              System.out.println("no card");
            //good ending
            break;
          }
          card.show_card();
          System.out.println("Social : "+ gs.getSocial() + " Academics: " + gs.getStudying() +" Mental Health: "+ gs.getMental_health() + " Money: "+gs.getMoney());
          userChoice = getChoice();
          EventCard[] eventCards = gs.updateGameState(userChoice, card);
          if(eventCards!=null){
            for (int i =0; i < eventCards.length; i++){
              cards.addCard(eventCards[i]);
            }
          }

        }

        gameEnding(gs.getEndingType());
      }

      private static void gameSetup(){
        GameOption[] roommate_opt = new GameOption[3];
        // options[i] = new GameOption(String text, int studyingChange, int socialChange, int moneyChange, int mentalHealthChange, EventCard[] eventCards)
        roommate_opt[0] = new GameOption("Vanessa: her description online states: I want to party 24/7", -1, 1, 0, 0, null, null);
        roommate_opt[1] = new GameOption("Jessica: her description online state: studying is the main priority for me.", 1, 0, 0, 0, null, null);
        roommate_opt[2] = new GameOption("No roommate: you decide to live the life of solitude", 0, -1, 0, 0, null, null);
        cards.addCard(new Card("Roommate", "Which roommate have you picked?", roommate_opt));
        System.out.print(cards.size());

        GameOption[] party_opt = new GameOption[3];
        party_opt[0] = new GameOption("No, I have to finish my math homework", 1, -1, 0, 0, null, null);
      	party_opt[1] = new GameOption("Yeah sure! Let’s party!", -1, 1, 0, 0, null, null);
      	party_opt[2] = new GameOption("I’m gonna nap instead", 0, -1, 0, 1 , null, null);
        cards.addCard(new Card("Party", "Are you down to go to a party?", party_opt));

        GameOption[] club_opt = new GameOption[3];
        club_opt[0] = new GameOption("Yes, I want to join Kappa Alpha Theta, the sorority", 0, 1, 0, 0, null, null);
        club_opt[1] = new GameOption("Yes, I want to join the robotics club", 1, 1, 0, 0, null, null);
        club_opt[2] = new GameOption("No, I would rather not join a club", 0, -1, 0, 0, null, null);
        cards.addCard(new Card("Club", "Are you looking to join any clubs?", club_opt));

        GameOption[] financial_opt = new GameOption[3];
        financial_opt[0] = new GameOption("I will buy my textbooks through the bookstore, it doesn’t provide discounts but it sure is convenient", 0, 0, 1, 0, null, null);
        financial_opt[1] = new GameOption("I found my textbooks on a free online site. It is a bit sketchy but I will take the risk. It is free anyway", 0, 0, -1, 0, null, null);
        financial_opt[2] = new GameOption("I am just gonna wing the class without any textbooks.", 0, -1, 0, 0, null, null);
        cards.addCard(new Card("School Supply Financials", "You need textbooks for class. How do you plan on obtaining them?", financial_opt));

        GameOption[] sleep_opt = new GameOption[3];
        sleep_opt[0] = new GameOption("I slept a full 8 hours", 0, 0, 0, 1, null, null);
        sleep_opt[1] = new GameOption("I slept a minimum of 3 hours, but hey i still got some sleep", 0, 0, 0, -1, null, null);
        sleep_opt[2] = new GameOption("Sleep is for the weak. I did not sleep at al", 0, 0, 0, -2, null, null);
        cards.addCard(new Card("Sleep", "How many hours of sleep did you get?", sleep_opt));

        GameOption[] concert_opt = new GameOption[3];
        concert_opt[0] = new GameOption("Go to the concert! I want to have some fun", -1, 1, 0, 0, null, null);
        concert_opt[1] = new GameOption("I think i’ll stay in and work on the assignment", 1, -1, 0, 0, null, null);
        concert_opt[2] = new GameOption("I’ll meet a friend for a quick dinner", 0, 0, 0, 1, null, null);
        cards.addCard(new Card("Concert", "There’s a concert going on but you have an assignment due tomorrow! What do you want to do?", concert_opt));









        //cards.addCard(new Card("name", "description", options));

      }

}
