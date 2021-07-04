import java.lang.*;

public class Product
{
	
	protected String productName;
	protected String productId;
	protected double price;
	protected int quantity;
	
	public class Product(){
		System.out.println("Empty cons");
	}
	
	public void setProductName(String productName)
	{
		this.productName=productName;
	}
	
	public void setProductId(String productId)
	{
		this.productId=productId;
	}
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	
	public void setQuantity(int quantity)
	{
		this.quantity=quantity;
	}
	
	public String getProductName()
	{
		return productName;
	}
    public String getProductId()
	{
		return productId;
	}
    public double getPrice()
	{
		return price;
	}	
	public int getQuantity()
	{
		return quantity;
	}
	public void addQuantity(int amount)
	{
	 this.amount=amount;
	}
	public void reduceQuantity(int amount)
	{
	 this.amount=amount;
	}
	
}