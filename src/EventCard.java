public class EventCard extends Card{

    private int location;

    public EventCard(String name, String descript, GameOption[] arr, int location ){
        this.name_of_card = name;
        this.description = descript;
        this.options = arr;
        this.location = location;
    }

    public EventCard(){

    }

    public int getLocation() {
        return location;
    }
}
