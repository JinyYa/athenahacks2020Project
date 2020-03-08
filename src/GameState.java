
public class GameState {
    public static final int MAX_RESOURCE = 20;
    private int money;
    private int studying;
    private int mental_health;
    private int social;

    public gameState(){ //constructor method
        //resources
        money = 5;
        studying = 5;
        mental_health = 5;
        social = 5;

        //special event flags

    }

    public int getGrade() {
        return grade;
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
    public int getMoney() {
        return money;
    }

}
