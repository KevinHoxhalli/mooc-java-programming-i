import java.util.ArrayList;

public class Hold {
    
    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if(this.totalWeight() + suitcase.totalWeight() <= this.maximumWeight )
            this.suitcases.add(suitcase);
    }
    
    public int totalWeight() {
        int sum = 0;
        for(Suitcase s: this.suitcases) {
            sum = sum + s.totalWeight();
        }
        return sum;
    }
    
    public String toString() {
        String output = "";
        if(this.suitcases.size() == 0) {
            output = "no suitcases";
        } else if(this.suitcases.size() == 1) {
            output = "1 suitcase";
        } else {
            output = this.suitcases.size()+ " suitcases";
        }
        return output+" ("+this.totalWeight()+" kg)";
    }
    
    public void printItems() {
        for(Suitcase s: this.suitcases) {
            s.printItems();
        }
    }
}
