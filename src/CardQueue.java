import java.util.NoSuchElementException;
import java.util.Queue;


public class CardQueue {
    private Queue <Card> queue;

    //creates a card queue with existing Queue<Cards>
    public CardQueue(Queue<Card> queue) {
        this.queue = queue;
    }

    //creates an empty card queue
    public CardQueue() {
        this.queue = new Queue <Card>;
    }

    //adds cards to current queue
    public void addCard(Card card){
        queue.add(card);
    }

    //gets sub-cards if there are OptionANext or OptionBNext cards
    //or just next card in queue by popping
    public Card getNextCard(Card currentCard, int choice) throws NoSuchElementException {
        Card toReturn;
        if(choice){
            toReturn = currentCard.getOptionANext();
        }
        else{
            toReturn = currentCard.getOptionBNext();
        }

        if(toReturn == null){
            toReturn = queue.remove();
        }
        return toReturn;
    }

    public int size(){
        return queue.size();
    }
}
