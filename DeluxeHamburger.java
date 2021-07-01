package Section7;

public class DeluxeHamburger extends HealthyHamburger{
    
    private String BreadRoll;
    private boolean isValid;
    private double basePrice2 = 4.50;
    
    private String drink;

    public DeluxeHamburger(String BreadRoll, String meat, String drink) {
        super(meat);
        
        if(meat != null && BreadRoll != null && drink != null){
            isValid = true;
        }else{
            isValid = false;
        }
        
       this.drink = drink;
    }

    public double getBasePrice2() {
        return basePrice2;
    }

    public String getDrink() {
        return drink;
    }
    
     @Override
     public void getFinalPrice(){
        if(isValid){
            System.out.println("Your base price is " + getBasePrice2());
            System.out.println("Your deluxe burger comes with " + drink + " and chips");
            System.out.println("Your total cost is " + (getBasePrice2() + 1.50));
        }
     } 
  }

