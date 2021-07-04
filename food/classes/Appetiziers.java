package  classes;
import java.lang.*;

public class  Appetiziers extends FoodItem
{
	private String size ;

	public void setSize(String size )
	{
		this.size  = size ;
	}
	public  String getSize( )
	{
		return size ;
	}
	public void showInfo()
	{
		System.out.println("Fid: "+fid);
		System.out.println("name: "+name);
		System.out.println("size : "+getSize( ) );
		System.out.println("Available Quantity: "+availableQuantity);
		System.out.println("Price: "+price);
		System.out.println();
	}
}
