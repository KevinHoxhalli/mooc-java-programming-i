
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevin
 */
public class Stack {
    private ArrayList<String> values;
    
    public Stack() {
        this.values = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        if(this.values.isEmpty())
            return true;
        return false;
    }
    
    public void add(String value) {
        if(!this.values.contains(value))
            this.values.add(value);
    }
    
    public ArrayList<String> values() {
        return this.values;
    }
    
    public String take() {
        String take;
        take = this.values.get(this.values.size()-1);
        this.values.remove(this.values.get(this.values.size()-1));
        return take;
    }
}
