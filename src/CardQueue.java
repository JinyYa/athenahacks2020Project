import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.LinkedList;


public class CardQueue {
    private LinkedList <Card> queue;

    //creates a card queue with existing Queue<Cards>
    public CardQueue(LinkedList<Card> queue) {
        this.queue = queue;
    }

    //creates an empty card queue
    public CardQueue() {
        this.queue = new LinkedList<>();;
    }

    //adds cards to current queue
    public void addCard(Card card){
        this.queue.add(card);
    }
    public void addCard(Card card,int loc){
        queue.add(loc,card);
    }


    //gets sub-cards if there are OptionANext or OptionBNext cards
    //or just next card in queue by popping
    public Card getNextCard(Card currentCard, int choice) {
        Card toReturn = null;
        if(currentCard!=null){
          toReturn = currentCard.getSubCard(choice);
        }
        if(toReturn == null){
            return queue.poll();
        }
        return toReturn;
    }

    public int size(){
        return queue.size();
    }

}
