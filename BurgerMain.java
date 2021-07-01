package Section7;

public class BurgerMain{
    public static void main(String [] args){
        
        BaseHamburger burger = new BaseHamburger("Bread Roll", "Hamburger Meat");
        burger.addCheese();
        burger.addLettuce();
        burger.addPickle();
        
        burger.getFinalPrice();
        
        System.out.println("=======================");
        
        HealthyHamburger burger1 = new HealthyHamburger("Hamburger meat");
        burger1.addCheese();
        burger1.addEgg();
        burger1.addLettuce();
        
        burger1.getFinalPrice();
        
         System.out.println("=======================");
         
         DeluxeHamburger burger3 = new DeluxeHamburger("White roll", "medium", "7up");
         burger3.getDrink();
         burger3.getFinalPrice();
         
    }
}