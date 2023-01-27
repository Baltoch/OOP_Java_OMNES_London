/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial5_1;

/**
 *
 * @author balth
 */

/**
 * @hidden 
 * a)	Create an abstract class DiscountPolicy. It should have a single abstract method computeDiscount that 
 * will return the discount for the purchase of a given number of a single item. The method has two parameters, count
 * and itemCost. 
 * 
 * b)	Derive a class BulkDiscount from DiscountPolicy. It should have a constructor that has two parameters,
 * minimum and percent. It should define the method computeDiscount so that if the quantity purchased of an item is
 * more than minimum, the discount is percent%. 
 * 
 * c)	Derive a class BuyNItemsGetOneFree from DiscountPolicy. The class should have a constructor that has a
 * single parameter ‘n’. In addition, the class should define the method computeDiscount so that every nth item is free.
 * For example, the following table gives the discount for the purchase of various counts of an item that costs $10, 
 * when n is 3:
 * 
 *      Count       1       2       3       4       5       6       7
 *      Discount  0       0     10     10    10     20     20
 * 
 * d)	Derive a class CombinedDiscount from DiscountPolicy. It should have a constructor that has two parameters
 * of type DiscountPolicy. It should define the method computeDiscount to return the maximum value returned by 
 * computeDiscount for each of its two private discount policies. The two discount policies are described in (b) and (c). 
 */
public class Tutorial5_1Q4 {
    public static void main(String[] args)
    {
        final int NUMBER_OF_POLICIES = 3;
        DiscountPolicy[] policies = new DiscountPolicy[NUMBER_OF_POLICIES];
        
        // Instance of BulkDiscount
        policies[0] = new BulkDiscount(5, 50);
        
        // Instance of BuyNItemsGetOneFree
        policies[1] = new BuyNItemsGetOneFree(3);
        
        // Instance of CombinedDiscount
        policies[2] = new CombinedDiscount(policies[0], policies[1]);
        
        for(int i = 0; i < NUMBER_OF_POLICIES; i++)
        {
            System.out.println(policies[i].computeDiscount(500, 10));
        }
        
    }
}

abstract class DiscountPolicy {
    public abstract double computeDiscount(int count, double itemCost);
}

class BulkDiscount extends DiscountPolicy {
    private int minimum;
    private double percent;
    
    public BulkDiscount(int minimum, double percent)
    {
        this.minimum = minimum;
        this.percent = percent;
    }
    
    @Override
    public double computeDiscount(int count, double itemCost)
    {
        if(count < minimum) return 0;
        else return count * itemCost * (percent / 100);
    }
}

class BuyNItemsGetOneFree extends DiscountPolicy {
    private int n;

    public BuyNItemsGetOneFree(int n) {
        this.n = n;
    }
    
    @Override
    public double computeDiscount(int count, double itemCost)
    {
        return count / n * itemCost;
    }
}

class CombinedDiscount extends DiscountPolicy {
    private DiscountPolicy policy1;
    private DiscountPolicy policy2;
    
    public CombinedDiscount(DiscountPolicy policy1, DiscountPolicy policy2)
    {
        this.policy1 = policy1;
        this.policy2 = policy2;
    }
    
    @Override
    public double computeDiscount(int count, double itemCost)
    {
        if(policy1.computeDiscount(count, itemCost) > policy2.computeDiscount(count, itemCost)) return policy1.computeDiscount(count, itemCost);
        else return policy2.computeDiscount(count, itemCost);
    }
}