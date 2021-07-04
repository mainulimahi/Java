package Classes;

import java.lang.*;


public class ImportedProduct extends Product 
{
	private String countryName;
	
	public void setCountryName(String countryName) {this.countryName = countryName;}
	public String getCountryName() {return countryName;}
	
	public void showInfo()
	{
		System.out.println("Product id : "+getPid());
		System.out.println("Product name : "+getName());
		System.out.println("Product availableQuantity : "+getAvailableQuantity());
		System.out.println("Price : $"+getPrice());
		System.out.println("Country name : "+countryName);
	}
}