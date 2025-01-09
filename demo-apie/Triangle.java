import java.math.BigDecimal;

public class Triangle extends Shape{
  
  // attribute
  // private String colorName;
  private double base;
  private double height;

  // constructor
  public Triangle (String colorName, double base, double height){
    super(colorName);
    this.base = base;
    this.height = height;
  }

  public double triangleArea(){
    return BigDecimal.valueOf(this.base)//
    .multiply(BigDecimal.valueOf(this.height))//
    .doubleValue();
  }
}
