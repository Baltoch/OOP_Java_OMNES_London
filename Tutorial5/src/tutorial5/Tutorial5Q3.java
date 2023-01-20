/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial5;

/**
 *
 * @author balth
 */

/**
 * @hidden
 * Design a class named Person with fields for holding a person’s name, address, and telephone number. Write one or 
 * more constructors and the appropriate mutator and accessor methods for the class’s fields. 
 * Next, design a class named Customer, which extends the Person class. The Customer class should have a field for a
 * customer number and a boolean field indicating whether the customer wishes to be on a mailing list. Write one or more 
 * constructors and the appropriate mutator and accessor methods. 
 * A retail store has a preferred customer plan where customers can earn discounts on all their purchases. The amount 
 * of a customer’s discount is determined by the amount of the customer’s cumulative purchases in the store as follows: 
 * •	When a preferred customer spends £500, he or she gets 5% discount on all future purchases. 
 * •	When a preferred customer spends £1000, he or she gets 6% discount on all future purchases.  
 * •	When a preferred customer spends £1500, he or she gets 7% discount on all future purchases.
 * •	When a preferred customer spends £2000, he or she gets 10% discount on all future purchases.
 * Design a class named PreferredCustomer, which extends the Customer class. The PreferredCustomer class should 
 * have fields for the amount of the customer’s purchases and the customer’s discount level. Write one or more 
 * constructors and the appropriate mutator and accessor methods. Demonstrate the class in a simple program.  
 * 
 */
public class Tutorial5Q3 {
    public static void main(String[] args)
    {
        PreferedCustomer prefCustom = new PreferedCustomer();
        prefCustom.setName("Sherlock");
        prefCustom.setAddress("221 b, Baker Street, London");
        prefCustom.setTelephone("0110022003");
        prefCustom.setNumber(221);
        prefCustom.setMailList(true);
        prefCustom.setPurchaseAmount(2500);
        
        System.out.println("Customer number " + prefCustom.getNumber());
        System.out.println("Name : " + prefCustom.getName());
        System.out.println("Address : " + prefCustom.getAddress());
        System.out.println("Telephone number : " + prefCustom.getTelephone());
        if(prefCustom.isMailList()) System.out.println(prefCustom.getName() + " is subscribed to the mail list");
        else System.out.println(prefCustom.getName() + " is not subscribed to the mail list");
        System.out.println("Total amount of purchases: " + prefCustom.getPurchaseAmount());
        System.out.println("Discount level: " + (int) (100 * prefCustom.getDiscountLevel()) + "%");
    }
}


class Person {
    private String name;
    private String address;
    private String telephone;

    public Person() {
        name = "";
        address = "";
        telephone = "";
    }

    public Person(String name, String address, String telephone) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}

class Customer extends Person {
    private int number;
    private boolean mailList;
    
    public Customer()
    {
        super();
        number = 0;
        mailList = false;
    }
    
    public Customer(String name, String address, String telephone, int number, boolean mailList)
    {
        super(name, address, telephone);
        this.number = number;
        this.mailList = mailList;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isMailList() {
        return mailList;
    }

    public void setMailList(boolean mailList) {
        this.mailList = mailList;
    }
}

class PreferedCustomer extends Customer {
    private double purchaseAmount;
    private double discountLevel;
    
    public PreferedCustomer() 
    {
        super();
        purchaseAmount = 0;
        discountLevel = 0;
    }
    
    public PreferedCustomer(String name, String address, String telephone, int number, boolean mailList, double purchaseAmount)
    {
        super(name, address, telephone, number, mailList);
        this.purchaseAmount = purchaseAmount;
        discountLevel = getDiscountLevel(purchaseAmount);
    }
    
    private double getDiscountLevel(double purshaseAmount)
    {
        if(purshaseAmount > 2000) return 0.1;
        else if(purshaseAmount > 1500) return 0.07;
        else if(purshaseAmount > 1000) return 0.06;
        else if(purshaseAmount > 500) return 0.05;
        else return 0;
    }

    public double getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
        this.discountLevel = this.getDiscountLevel(purchaseAmount);
    }

    public double getDiscountLevel() {
        return discountLevel;
    }
}