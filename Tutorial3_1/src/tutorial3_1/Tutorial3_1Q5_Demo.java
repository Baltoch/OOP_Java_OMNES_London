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
public class Tutorial3_1Q5_Demo {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Tutorial3_1Q5 policy = new Tutorial3_1Q5();
        System.out.println("Enter a client ID:");
        policy.setCustomerId(input.nextLong());
        System.out.println("Enter a type of policy (health or auto):");
        policy.setTypeOfPolicy(input.next());
        System.out.println("The premium for your policy is: " + policy.getPremium());
        if(policy.getTypeOfPolicy().contentEquals("auto")){
            System.out.println("Would you also want an health insurance (Enter Y for yes or N for no):");
            if(input.next().charAt(0) == 'Y')
            {
                Tutorial3_1Q5 policy2 = new Tutorial3_1Q5(policy.getCustomerId(), "health");
                System.out.println("The premium for your policy is: " + policy2.getPremium());
            }
        }
        else if(policy.getTypeOfPolicy().contentEquals("health"))
        {
            System.out.println("Would you also want an auto insurance (Enter Y for yes or N for no):");
            if(input.next().charAt(0) == 'Y')
            {
                Tutorial3_1Q5 policy2 = new Tutorial3_1Q5(policy.getCustomerId(), "auto");
                System.out.println("The premium for your policy is: " + policy2.getPremium());
            }
        }
        System.exit(0);
    }
}
