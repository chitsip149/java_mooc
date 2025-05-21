
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }
    
    @Override 
    public boolean equals(Object object){
        if (this == object){
            return true;
        }
        if (object==null || this.getClass() != object.getClass()){
            return false;
        }
        
        LicensePlate date = (LicensePlate) object;
        return (this.toString().equals(date.toString()));
        
    }
    
    @Override
    public int hashCode(){
        int result = 17;
        if (this.country!=null){
            result = 31*result+this.country.hashCode();
        }
        if (this.liNumber!=null){
            result = 31*result+this.liNumber.hashCode();
        }
        return result;
    }

}
