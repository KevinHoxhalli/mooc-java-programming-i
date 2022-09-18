/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevin
 */
public class Timer {
    private ClockHand hund;
    private ClockHand sec;
    
    public Timer() {
        this.hund = new ClockHand(100);
        this.sec = new ClockHand(60);
    }
    public void advance() {
        this.hund.advance();
        
        if(this.hund.value()==0) {
            this.sec.advance();
            
        }
    }
    public String toString() {
        return sec+":"+hund;
    }
}
