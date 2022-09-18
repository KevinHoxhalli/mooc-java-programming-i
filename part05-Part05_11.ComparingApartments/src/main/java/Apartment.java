
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public int getRooms() {
        return rooms;
    }

    public int getSquares() {
        return squares;
    }

    public void setPricePerSquare(int pricePerSquare) {
        this.pricePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
       if(this.squares > compared.squares)
           return true;
       return false;
    }
    
    public int priceDifference(Apartment compared) {
        return (this.squares*this.pricePerSquare)-(compared.squares*compared.pricePerSquare)>=0 ? (this.squares*this.pricePerSquare)-(compared.squares*compared.pricePerSquare):((this.squares*this.pricePerSquare)-(compared.squares*compared.pricePerSquare))*-1;
    }
    
     public boolean moreExpensiveThan(Apartment compared) {
         if(this.squares*this.pricePerSquare > compared.squares*compared.pricePerSquare)
             return true;
         return false;
     }
}
