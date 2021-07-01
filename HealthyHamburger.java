package Section7;

public class HealthyHamburger extends BaseHamburger{
    
    private String BrownRyeRoll;
    private boolean isValid;
    private double basePrice1;
    private double additionalPrice1 = 0;
    
    public HealthyHamburger(String meat){
        super("Brown Rye", meat);
        
        if(meat != null){
            isValid = true;
            basePrice1 = 4;
        }else{
            isValid = false;
        }
    }

    public double getBasePrice1() {
        return basePrice1;
    }

    public double getAdditionalPrice1() {
        return additionalPrice1;
    }
    
    
    
    @Override
     public void addLettuce(){
        if(isValid){
            System.out.println("Lettuce added which has a charge of 50p");
            additionalPrice1 += 0.50;
            
        }else{
            System.out.println("This cannot be added");
        }
    }
    
     @Override
    public void addTomato(){
        if(isValid){
            System.out.println("Tomato added which has a charge of 50p");
            additionalPrice1 += 0.50;
           
        }else{
            System.out.println("This cannot be added");
        }
    }
    
    @Override
    public void addCheese(){
        if(isValid){
            System.out.println("Cheese added which has a charge of 50p");
            additionalPrice1 += 0.50;
            
        }else{
            System.out.println("This cannot be added");
        }
    }
    
    @Override
    public void addPickle(){
        if(isValid){
            System.out.println("Pickle added which has a charge of 50p");
            additionalPrice1 += 0.50;
           
        }else{
            System.out.println("This cannot be added");
        }
    }
    
    public void addEgg(){
        if(isValid){
            System.out.println("Egg added which has a charge of £1");
            additionalPrice1 += 1;
            
        }else{
            System.out.println("This cannot be added");
        }
    }
    
    public void addOnions(){
        if(isValid){
            System.out.println("Onion added which has a charge of 40p");
            additionalPrice1 += 0.40;
        
        }else{
            System.out.println("This cannot be added");
        }
    }
    
    @Override
     public void getFinalPrice(){
        if(isValid){
            System.out.println("Your base price is " + getBasePrice1());
            System.out.println("Your additional price is " + getAdditionalPrice1());
            System.out.println("Your total cost is " + (getBasePrice1() + getAdditionalPrice1()));
        }
    }
    
    
}