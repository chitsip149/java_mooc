
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus (Money addition){
        Money money = new Money(this.euros+addition.euros(), this.cents+addition.cents());
        return money;
    }
    
    public boolean lessThan (Money compared){
        if (this.euros<compared.euros()) {
            return true;
        }
        if (this.euros==compared.euros() && this.cents<compared.cents()){
            return true;
        }
        return false;
    }
    
    public Money minus(Money decreaser){
        int thisCents = this.euros*100+this.cents;
        int thatCents = decreaser.euros()*100+decreaser.cents();
        int res = thisCents-thatCents;
        if (res<=0){
            return new Money(0, 0);
        }
        return new Money(0, res);
    }

}
