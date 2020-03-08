
public class GameState {
    public static final int MAX_RESOURCE = 20;
    public static final int NO_ROOMMATE = 0;

    private int money;
    private int studying;
    private int mental_health;
    private int social;
    private int[10] flags;
    private int club;


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

    public void changeGrade(int change){
        grade += change;
    }

    public void updateGameState(int userChoice, Card card){
        gameOption myOption = card.getOption(choice);
        //update all game resources

        //set all flags
        if (card.getOption(choice).getFlag()){

        }
    }

}
