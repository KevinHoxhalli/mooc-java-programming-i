
import java.util.ArrayList;


public class Room {
    private ArrayList<Person> people;
    
    public Room() {
        this.people = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.people.add(person);
    }
    
    public boolean isEmpty(){ 
        if(this.people.isEmpty())
            return true;
        return false;
    }
    
    public ArrayList<Person> getPersons() {
        return this.people;
    }
    
    public Person shortest() {
        if(this.people.isEmpty()) {
            return null;
        }
        Person shortest = this.people.get(0);
        
        for(Person p: this.people) {
            if(p.getHeight()<shortest.getHeight()) {
                shortest = p;
            }
        }
        return shortest;
    }
    
    public Person take() {
        if(this.people.isEmpty()) {
            return null;
        }
        Person shortest = this.shortest();
        this.people.remove(shortest);
        return shortest;
    }
}
