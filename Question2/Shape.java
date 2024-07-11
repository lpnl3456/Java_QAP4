package Question2;


public abstract class Shape implements Scalable{
    //The name of the Shape object
    private String name;

    //Constructors for the Shape object
    public Shape(){

    }
    public Shape(String n){
        name = n;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //Abstract Method to get the area of the SHape object
    public abstract double getArea();

    //Abstract Method to get the perimeter of the Shape object
    public abstract double getPerimeter();

    //Convert the Shape's object data to a string
    public String toString() {
       return ("Shape[ Name: " + name);
    }
}
