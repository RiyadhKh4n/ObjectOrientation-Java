package Section7;

public class BaseHamburger{
    
    private String BreadRoll;
    private String meat;
    private double basePrice = 3;
    private double additionalPrice = 0;
    
    private boolean isValid;
    

    
    public BaseHamburger(String BreadRoll, String meat){
        if(BreadRoll != null && meat != null){
            isValid = true;
        }else{
            isValid = false;
        }
        
        this.BreadRoll = BreadRoll;
        this.meat = meat;
        this.basePrice = basePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getAdditionalPrice() {
        return additionalPrice;
    }
    
    public void addLettuce(){
        if(isValid){
            System.out.println("Lettuce added which has a charge of 50p");
            additionalPrice += 0.50;
            
        }else{
            System.out.println("This cannot be added");
        }
    }
    
    public void addTomato(){
        if(isValid){
            System.out.println("Tomato added which has a charge of 50p");
            additionalPrice += 0.50;
           
        }else{
            System.out.println("This cannot be added");
        }
    }
    
    public void addCheese(){
        if(isValid){
            System.out.println("Cheese added which has a charge of 50p");
            additionalPrice += 0.50;
            
        }else{
            System.out.println("This cannot be added");
        }
    }
    
    public void addPickle(){
        if(isValid){
            System.out.println("Pickle added which has a charge of 50p");
            additionalPrice += 0.50;
           
        }else{
            System.out.println("This cannot be added");
        }
    }
    
    public void getFinalPrice(){
        if(isValid){
            System.out.println("Your base price is " + getBasePrice());
            System.out.println("Your additional price is " + getAdditionalPrice());
            System.out.println("Your total cost is " + (getBasePrice() + getAdditionalPrice()));
        }
    }
    
  
    
    
}