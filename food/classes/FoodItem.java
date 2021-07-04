package  classes;

import java.lang.*;
import interfaces.*;

public abstract class FoodItem implements IQuantity
{  protected String fid;
   protected  String name ;
protected int availableQuantity;
 protected double price;
	//protected int String fid;
	//protected double availableQuantity ;

	public void setFid(String fid){this.fid = fid;}

	public void setName(String name){this.name = name;}

	public void setAvailableQuantity(int availableQuantity ) {this.availableQuantity  =availableQuantity ;}

	public void setPrice(double price){this.price =price;}




	public String getName(){return  name;}

	public String getFid(){return fid;}

	public int getAvailableQuantity(){return  availableQuantity;}

	public double  getPrice(){return price;}



	public abstract void showInfo();




	public void addQuantity(int amount)
	{
		if(amount>0)
		{
			System.out.println("Previous availableQuantity : "+ availableQuantity );
			System.out.println("Add Quantity Amount: "+ amount);
			availableQuantity  += amount;
			//availableQuantity  = availableQuantity  + amount;
			System.out.println("Current Available Quantity : "+ availableQuantity );
		}
		else
		{
			System.out.println("Can Not Add Quantity");
		}
	}
	public void  sellQuantity(int amount)
	{
		if(amount>0 && amount<=availableQuantity )
		{
			System.out.println("Previous availableQuantity :	"+ availableQuantity );
			System.out.println(" sell Quantity:	"+ amount);
			availableQuantity  -= amount;
			//availableQuantity  = availableQuantity  - amount;
			System.out.println("Current availableQuantity :	"+ availableQuantity );
		}
		else
		{
			System.out.println("Can Not  sell Required Quantity");
		}
	}

}
