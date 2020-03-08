public class GameState {
    public static final int MAX_RESOURCE = 20;
    public static final int NO_ROOMMATE = 0;
    public static final int HAPPY_ENDING = 0;
    public static final int MONEY_SAD = 1;
    public static final int STUDY_SAD = 2;
    public static final int MENTAL_HEALTH_SAD = 3;
    public static final int SOCIAL_SAD = 4;
    public static final int CLUB_SAD = 5;




    private int money;
    private int studying;
    private int mental_health;
    private int social;
    //private int[10] flags;
    private int club;

    private int roommate;
    private int endingType = 0;

    public GameState(){ //constructor method
        //resources
        money = 5;
        studying = 5;
        mental_health = 5;
        social = 5;

        //special event flags/vars
        roommate = NO_ROOMMATE;
        club = 0;
    }

    public int getStudying() {
        return getStudying();
    }

    public int getMental_health() {
        return mental_health;
    }

    public int getMoney() {
        return money;
    }

    public int getSocial() {
        return social;
    }

    //setters
    public void changeStudying(int change){
        studying += change;
    }

    public EventCard[] updateGameState(int userChoice, Card card){
        GameOption myOption = card.getOption(userChoice);
        //update all game resources
        studying+= myOption.getStudyingChange();
        social+= myOption.getSocialChange();
        mental_health+=myOption.getMentalHealthChange();
        money+=myOption.getMoneyChange();
        return myOption.getEventCards();
    }
    public boolean gameOver(){
        //studying 0
        if(money == 0){
            //set gameendType to certain int
          endingType = MONEY_SAD;
          return true;
        }

        else if(studying == 0){
          endingType = STUDY_SAD;
          return true;
        }
        else if(mental_health == 0){
          endingType = MENTAL_HEALTH_SAD;
          return true;
        }
        else if(social ==0){
          endingType = SOCIAL_SAD;
          return true;
        }
        else if (club == 0){
          endingType = CLUB_SAD;
          return true;
        }
        else{
          return false;
        }
    }


    public int getEndingType(){
      if(gameOver() == false){
        return HAPPY_ENDING;
      }
      return endingType;
    }


}
