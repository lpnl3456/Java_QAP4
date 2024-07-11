package Question2;

import java.util.ArrayList;


public class Demo {
    //Method to scale Shape objects and display their new data
    public static void scaleShapes(double scaleFactor, ArrayList<Scalable> shapeList){
        
        for(Scalable i: shapeList ){
            System.out.println(i.toString());
            //Scale the Shape Object using the scaleFactor
            i.scale(scaleFactor);
            //Print the new data
            System.out.println(i.toString());
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //Array to store the Shape objects
        ArrayList <Scalable> shapeList = new ArrayList<Scalable>();
        //Create one of each Shape object
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

                    //Call the scaleShapes method to Scale the Shape objects
                   scaleShapes(2, shapeList);

                }
                    
}
