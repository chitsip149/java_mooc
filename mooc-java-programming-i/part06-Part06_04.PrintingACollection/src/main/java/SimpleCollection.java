
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    @Override
    public String toString(){
        String ret = "The collection "+this.name;
        if (this.elements.isEmpty()){
            ret +=" is empty.";
        } else {
            ret += " has "+this.elements.size();
            if (this.elements.size()==1){
                ret+=" element:\n"+this.elements.get(0);
            } else {
                ret+=" elements:";
                for (String element:this.elements){
                    ret+="\n"+element;
                }
            }
        }
        return ret;
    }
    
}
