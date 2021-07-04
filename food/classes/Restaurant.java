package  classes;
import java.lang.*;
import interfaces.*;

public  class Restaurant  implements FoodItemOperations
{
	private String name;
	private String rid;
	private FoodItem fooditems[] = new FoodItem [10];


	public void setName(String name){this.name = name;}
	public void setRid(String rid){this.rid = rid;}


	public String getName(){return name;}
	public String getRid(){return rid;}

	public void insertFoodItem(FoodItem a)
	{
		int flag = 0;
		for(int i=0; i<fooditems.length; i++)
		{
			if(fooditems[i] == null)
			{
				fooditems[i] = a;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("FoodItem Inserted");
		}
		else
		{
			System.out.println("Can Not Insert");
		}
	}

	public void removeFoodItem(FoodItem a)
	{
		int flag = 0;
		for(int i=0; i<fooditems.length; i++)
		{
			if(fooditems[i] == a)
			{
				fooditems[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("FoodItem Removed");}
		else{System.out.println("Can Not Remove");}
	}
	public void showAllFoodItems()
	{
		for(FoodItem a : fooditems)
		{
			if(a != null)
			{
				a.showInfo();
			}
		}
	}
	public FoodItem getFoodItem(String fid)
	{
		FoodItem a = null;

		for(int i=0; i<fooditems.length; i++)
		{
			if(fooditems[i] != null)
			{
				if(fooditems[i].getFid()== fid)
				{
					a = fooditems[i];
					break;
				}
			}
		}
		if(a != null)
		{
			System.out.println("FoodItem Found");
		}
		else
		{
			System.out.println("FoodItem Not Found");
		}
		return a;
	}
}
