public class gameOption {
    private String text;
    private int studyingChange;
    private int socialChange;
    private int moneyChange;
    private int mentalHealthChange;


    private Card eventCard;
    private int eventCardLoc;

    public Card subCard;

    public Card getSubCard() {
        return subCard;
    }

    public int getStudyingChange(){
        return studyingChange;
    }
    public int getMentalHealthChange() {
        return mentalHealthChange;
    }
    public int getSocialChange() {
        return socialChange;
    }
    public int getMoneyChange() {
        return socialChange;
    }
    public Card getEventCard(){
        return eventCard;
    }
    public int getEventCardLoc(){
        return eventCardLoc;
    }

}
