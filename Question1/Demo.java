package Question1;

import java.util.ArrayList;

//Class to test the Shape objects
public class Demo {
    public static void main(String[] args) {
        //Store the Shape objects
        ArrayList <Shape> shapeList = new ArrayList<Shape>();
        //Create one of each Shape object and add to shapeList
        //Catch any ArithmeticException errors from the inputs
        try{
        Triangle t1 = new Triangle("T1", 3, 4, 5);
        shapeList.add(t1);
        }

        catch(ArithmeticException e){
            System.out.println(e);
        }

        try{
            EquilateralTriangle t2 = new EquilateralTriangle("T2", 3, 3, 3);
            shapeList.add(t2);
            }
    
            catch(ArithmeticException e){
                System.out.println(e);
            }

            try{
                Ellipse e1 = new Ellipse("E1", 3, 2);
                shapeList.add(e1);
                
                }
        
                catch(ArithmeticException e){
                    System.out.println(e);
                }

                try{
                    Circle c1 = new Circle(3,3,3,"C1");
                    shapeList.add(c1);
                    }
            
                    catch(ArithmeticException e){
                        System.out.println(e);
                    }

                    //Display each Shape object's data
                    for(Shape i: shapeList){
                        System.out.println(i.toString());
                    } 
    }
}
