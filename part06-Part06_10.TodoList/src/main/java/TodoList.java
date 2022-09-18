
import java.util.ArrayList;


public class TodoList {
    private ArrayList<String> list;
    
    public TodoList() {
        this.list = new ArrayList<>();
    }
    
    public void add(String task) {
        this.list.add(task);
    }
    
    public void print(){
        if(this.list.isEmpty()){
            return;
        }
        int count = 0;
        for(String l: this.list) {
            count++;
            System.out.println(count+": "+l);
        }
    }
    
    public void remove(int number) {
        
        this.list.remove(number-1);
    }
}
