package Question1;

public class Triangle  extends Shape{
    //The three sides of the Triangle object
    private double side1;
    private double side2;
    private double side3;

    //Constructors of the Triangle Object
    public Triangle (){

    }

    public Triangle ( String name,double s1, double s2, double s3){
        super(name);

        if(s1 + s2 > s3 && s2 + s3 > s1 && s3 + s1 > s2){
            side1 = s1;
            side2 = s2;
            side3 = s3;
        }

        else{
            throw new ArithmeticException("Not a postive triangle");
        }
    }

    //Getters and Setters
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getSide3() {
        return side3;
    }

    //Method to get the Area of the Triangle object
    public double getArea(){
        double S = (side1 + side2 + side3)/2;
        return Math.sqrt(S*(S-side1)* (S-side2)*(S-side3));
    }

    //Methof to get the perimeter of the Triangle object
    public double getPerimeter(){
        return (side1 + side2 + side3);
    }

    //Convert the data of the Triangle object to a string 
    @Override
    public String toString() {
        return (super.toString() + " Triangle[ side1: " + side1 + ", side2: " + side2 + ", side3: " + side3 + ", area: " + getArea() + ", perimeter: " + getPerimeter()+"]]");
}

}
