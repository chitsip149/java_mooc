
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }
    
    public String getName(){
        return this.name;
    }
    
    public SimpleDate getBirthday(){
        return this.birthday;
    }
    
    public int getHeight(){
        return this.height;
    }
    
    public int getWeight(){
        return this.weight;
    }
    
    @Override
    public String toString(){
        return name+", "+birthday+", "+height+", "+weight;
    }
    

    // implement an equals method here for checking the equality of objects
    public boolean equals(Object compared){
//        System.out.println(this);
//        System.out.println(compared);
        if (this.toString().equals(compared.toString())){
            return true;
        }
        return false;
    }
}
