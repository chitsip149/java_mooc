
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public int squares(){
        return this.squares;
    }
    
    public int rooms(){
        return this.rooms;
    }
    
    public int pricePerSquare(){
        return this.pricePerSquare;
    }
    
    public boolean largerThan (Apartment compared){
        if (this.squares>compared.squares()){
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment compared){
        int thisPrice = this.squares*this.pricePerSquare;
        int thatPrice = compared.squares()*compared.pricePerSquare();
        if (thisPrice>=thatPrice){
            return thisPrice-thatPrice;
        }
        return thatPrice-thisPrice;
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        int thisPrice = this.squares*this.pricePerSquare;
        int thatPrice = compared.squares()*compared.pricePerSquare();
        if (thisPrice>thatPrice){
            return true;
        }
        return false;
    }

}
