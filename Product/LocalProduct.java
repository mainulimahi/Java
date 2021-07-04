import java.lang.*;
public class LocalProduct extends Product
{
	
	protected double discountRate;
	
	public class LocalProduct(){
		System.out.println("Empty cons");
	}
	public void setDiscountRate (double discountRate)
	{
		this.discountRate=discountRate;
		
	}
	public double getDiscountRate()
	{
		return discountRate;
	}

	
}