
public class PersonDetails{
    private String name;
     private double hight;
    private double wight;

     public String getName() {
    return name;
  }

  // Setter
  public void setName(String newName) {
    this.name = newName;
  }
  public double getHight() {
    return hight;
  }

  // Setter
  public void setHight(double hig) {
    this.hight = hig;
  }

  public double getWight() {
    return wight;
  }

  // Setter
  public void setWight(double wig) {
    this.wight = wig;
  }
  

     public double bmi() {          //BMI calculating method and printing
         double bmi=this.wight/(this.hight*this.hight);
         return bmi;
        
     }
     public String  healthyStaus(double bmi) {
      String health;
      if(bmi > 25) {
      health=	"You are overweight";
      }
      else if(bmi > 18.5) {
         
        health=	"You are healthy";
      }
      else {
         
        health=	"Not healthy";
      }
      return health;
  
    }

     
}