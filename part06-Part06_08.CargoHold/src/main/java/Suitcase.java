
import java.util.ArrayList;


public class Suitcase {
    private ArrayList<Item> items;
    private int maximumWeight;
    
    public Suitcase(int maximumWeight) {
        this.items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }
    
    public void addItem(Item item) {
        if(this.totalWeight() + item.getWeight() <= this.maximumWeight)
            this.items.add(item);
    }
    
    public int totalWeight() {
        int sum = 0;
        for(Item it: this.items) {
            sum = sum + it.getWeight();
        }
        return sum;
    }
    
    public String toString() {
        String output = "";
        if(this.items.size() == 0) {
            output = "no items";
        } else if(this.items.size() == 1) {
            output = "1 item";
        } else {
            output = this.items.size()+ " items";
        }
        return output+" ("+this.totalWeight()+" kg)";
    }
    
    public void printItems() {
        for(Item it: this.items) {
            System.out.println(it);
        }
    }
    
    public Item heaviestItem() {
        if(this.items.isEmpty()) {
            return null;
        }
        Item heaviest = this.items.get(0);
        for(Item it: this.items) {
            if(it.getWeight() > heaviest.getWeight()) {
                heaviest = it;
            }
        }
        return heaviest;
    }
}
