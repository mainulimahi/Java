import java .lang.*;
public class Start
{
	
	public static void main(String []args)
	
	{
		LocalProduct lp1=new LocalProduct();
		lp1.setProductName("Shirt");
		lp1.setProductId("24568");
		lp1.setPrize(500.00);
		lp1.setQuantity(3);
		lp1.setDiscountRate(10.25);
		
		System.out.println("Name: "+get.ProductName());
		System.out.println("ID: "+get.ProductId());
		System.out.println("Price: "+get.Price());
		System.out.println("Quantity: "+get.Quantity());
		System.out.println("Rate: "+get.DiscountRate());
		
		ImportedProduct ip1=new ImportedProduct();
		ip1.setProductName("T Shirt");
		ip1.setProductId("24578");
		ip1.setPrize(250.00);
		ip1.setQuantity(5);
		ip1.setCountryName("Bangladesh");
		
		System.out.println("Name: "+get.ProductName());
		System.out.println("ID: "+get.ProductId());
		System.out.println("Price: "+get.Price());
		System.out.println("Quantity: "+get.Quantity());
		System.out.println("Country: "+get.CountryName());
		
		
		
	}
	
}