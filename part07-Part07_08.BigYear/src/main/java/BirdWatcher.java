
import java.util.ArrayList;


public class BirdWatcher {
    private ArrayList<Bird> birds;

    public BirdWatcher() {
        this.birds = new ArrayList<>();
    }
    
    public void addBird(Bird bird) {
        birds.add(bird);
    }
    
    public void observation(String name) {
        for(Bird b: this.birds) {
            if(b.getName().equals(name)) {
                b.addObservation();
                return;
            }
        }
        System.out.println("Not a bird!");
    }
    
    public void All() {
        for(Bird b: this.birds) {
            System.out.println(b.toString());
        }
    }
    
    public void One(String name) {
        for(Bird b: this.birds) {
            if(b.getName().equals(name)) {
                System.out.println(b.toString());
                return;
            }
        }
        System.out.println("Not a bird!");
    }
    
}
