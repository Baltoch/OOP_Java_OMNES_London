/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial3_1;

import java.util.Scanner;

/**
 *
 * @author balth
 */

/**
 * @hidden
 * Write a class for an insurance company to determine policy premiums. The class should have 
 * the variables customer id, type of policy(health/auto). Write the necessary constructors, 
 * accessor and mutator methods. The method/s should calculate the premium for health and auto 
 * insurance policy.  The premium is calculated as follows:
 * The health insurance method asks users whether they smoke; the premium is $250 for smokers and 
 * $190 for nonsmokers. The auto insurance method asks users to enter the number of traffic tickets 
 * they have received in the last three years. The premium is $175 for drivers with three or more 
 * tickets, $140 for those with one or two tickets, and $95 for those with no tickets
 * Write the demo class that asks the user for the customer id.  It also prompts each user for the 
 * type of policy needed—health or auto. Calculate and display the premium for both the types of 
 * policies. Do you need static variables or methods here? Can you apply overloading?
 * 
 */
public class Tutorial3_1Q5 {
    private long customerId;
    private String typeOfPolicy;

    public Tutorial3_1Q5() {
    }

    public Tutorial3_1Q5(long customerId, String typeOfPolicy) {
        this.customerId = customerId;
        this.typeOfPolicy = typeOfPolicy;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getTypeOfPolicy() {
        return typeOfPolicy;
    }

    public void setTypeOfPolicy(String typeOfPolicy) {
        this.typeOfPolicy = typeOfPolicy;
    }
    
    public double getPremium()
    {
        Scanner input = new Scanner(System.in);
        switch(typeOfPolicy)
        {
            case "health" -> {
                System.out.println("Enter Y if you smoke and N if not:");
                if(input.next().charAt(0) == 'Y') return 250;
                else return 190;
            }
            case "auto" -> {
                System.out.println("Enter the number of traffic tickets you had in the last three years");
                long tickets = input.nextLong();
                if(tickets > 3) return 175;
                else if(tickets > 0) return 140;
                else return 95;
            }
            default -> {
                System.out.println("Error: Unknown type of policy");
                return 0;
            }
        }
    }
    
}
