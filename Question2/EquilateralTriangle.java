package Question2;

public class EquilateralTriangle extends Triangle{
    
//Constructor for the EquilateralTriangle Object
public EquilateralTriangle (String name, double s1, double s2, double s3){
    super(name, s1,s2,s3);
    if(s1 != s2 || s2 != s3 || s3 != s1){
        throw new ArithmeticException("All side must be equal");
    }
}

//Convert the data into of the EquilateralTriangle object into a String
@Override
public String toString() {
    return (super.toString() + "[Type: EquilateralTriangle]");
}
}
