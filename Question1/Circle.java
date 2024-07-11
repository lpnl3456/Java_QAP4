package Question1;

public class Circle extends Ellipse{
    
    //The radius of the circle
    private double r;

    // Constructors for the Circle object
    public Circle (double r, double a,double b, String n){
        super(n,a,b);

        if(a == b && b == r && a == r){
        this.r = r;
        }

        else{
            throw new ArithmeticException("The raduis is invalid");
        }
    }
    //Method to obtain the perimeter of the Circle object
    @Override
    public double getPerimeter() {
        
        return 2*Math.PI*r;
    }

    @Override
    //Convert the Circle object's data into a string
    public String toString() {
        return (super.toString() + "[Circle[ r: " + r + "]");
    }
}
