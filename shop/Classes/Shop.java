package Classes;

import java.lang.*;
import Interfaces.*;

public class Shop implements ProductOperation
{
	private String sid;
	private String name;
	private Product products[] = new Product[100];
	
	public void setSid(String sid) {this.sid = sid;}
	public void setName(String name) {this.name = name;}
	
	public String getSid() {return sid;}
	public String getName() {return name;}
	
	public void insertProduct(Product p)
	{
		int flag = 0 ;
		for(int i=0; i<products.length; i++)
		{
			if(products[i] == null)
			{
				products[i] = p;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("insert product");
		}else{
			System.out.println("can not insert product");
		}
	}
	
	public void removeProduct(Product a)
	{
		int flag = 0;
		for(int i=0; i<products.length; i++)
		{
			if(products[i] == a)
			{
				products[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Product Removed");
		}
		else
		{
			System.out.println("Can Not Remove");
		}
	}
	
	public Product getProduct(String pid)
	{
		Product p = null;
		
		for(int i=0; i<products.length; i++)
		{
			if(products[i] != null)
			{
				if(products[i].getPid().equals(pid))
				{
					p = products[i];
					break;
				}
			}
		}
		if(p != null)
		{
			System.out.println("Product Found");
		}
		else
		{
			System.out.println("Product Not Found");
		}
		return p;
	}
	
	public void showAllProducts()
	{
		for(Product p : products)
		{
			if (p != null)
			{
				p.showInfo();
				System.out.println();
			}
		}
	}
	

}
