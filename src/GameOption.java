public class GameOption {
    private String text;
    private int studyingChange;
    private int socialChange;
    private int moneyChange;
    private int mentalHealthChange;
    private EventCard[] eventCards;

    public Card subCard;
    public GameOption(String text, int studyingChange, int socialChange, int moneyChange, int mentalHealthChange, Card subCard , EventCard[] eventCards){
            this.text= text;
            this.studyingChange= studyingChange;
            this.socialChange = socialChange;
            this.moneyChange = moneyChange;
            this.mentalHealthChange = mentalHealthChange;
            this.subCard =subCard;
            this.eventCards = eventCards;
    }

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
    public EventCard[] getEventCards(){
        return eventCards;
    }

}
