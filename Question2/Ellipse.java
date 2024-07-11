package Question2;

public class Ellipse extends Shape{
    //The major of the Ellipse object
    private double a;
    //The minor of the Eliipse object
    private double b;

    public Ellipse(){

    }

    

    //Constructors for the Ellipse object
    public Ellipse ( String name, double major, double minor){
        super(name);
        if(major > minor){
            a = major;
            b = minor;
        }
        else{
            a = minor;
            b = major;
        }
    }

    //Method to obtain the area of the Ellipse object
    public double getArea() {
        return (Math.PI*a*b);
    }

    //Method to obtain the perimeter of the Ellipse object
    public double getPerimeter(){
        return (Math.PI*Math.sqrt(2*((a*a)+ (b*b)) - (((a-b)*(a-b))/2)));
    }

    //Getters and Setters
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    //Method to Ellipse Shape objects
    @Override
    public void scale(double scaling) {
        a = a * scaling;
        b= b* scaling;
        
    }

    //Convert the data insode the Ellipse pbject to a string
    @Override
    public String toString() {
        return( super.toString() + " Ellipse[ a: " + a + ", b: " + b + ", area " + getArea() + ", perimeter: " + getPerimeter() +"]]");
    }
}
