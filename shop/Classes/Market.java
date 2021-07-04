package Classes;

import java.lang.*;
import Interfaces.*;


public class Market implements ShopOperation,EmployeeOperation 
{
	private  Shop shops[] = new Shop[20];
	private  Employee employees[] = new Employee[20];
	

	public void insertShop(Shop s) 
	{
		int flag = 0;
		for(int i=0; i<shops.length; i++)
		{
			if(shops[i] == null)
			{
				shops[i] = s;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("shope Inserted");
		}
		else
		{
			System.out.println("Can Not Insert shop");
		}
	}
	
	public void removeShop(Shop s)
	{
		int flag = 0;
		for(int i=0; i<shops.length; i++)
		{
			if(shops[i] == s)
			{
				shops[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Shop Removed");
		}
		else
		{
			System.out.println("Can Not Remove Shop");
		}
	}
	
	public void showAllShops()
	{
		System.out.println("************************************");
		for(Shop s : shops)
		{
			if(s != null)
			{
				System.out.println("Shop Name : "+ s.getName());
				System.out.println("Shop ID : "+ s.getSid());
				System.out.println();
			}
		}
		System.out.println("**************************************");
	}
	
	public Shop getShop(String sid)
	{
		Shop s = null;
		
		for(int i=0; i<shops.length; i++)
		{
			if(
                 shops[i] != null)
			{
				if(shops[i].getSid().equals(sid))
				{
					s = shops[i];
					break;
				}
			}
		}
		if(s != null)
		{
			System.out.println("shop Found");
		}
		else
		{
			System.out.println("shop Not Found");
		}
		return s;
	}
	

	public void insertEmployee(Employee e)
	{
		int flag = 0;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == null)
			{
				employees[i] = e;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Employee Inserted");
		}
		else
		{
			System.out.println("Can Not Insert");
		}
	}
	
	public void removeEmployee(Employee e)
	{
		int flag = 0;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == e)
			{
				employees[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Employee Removed");
		}
		else
		{
			System.out.println("Can Not Remove");
		}
	}
	public void showAllEmployees()
	{
		System.out.println("***************************************");
		for(Employee e : employees)
		{
			if(e != null)
			{
				System.out.println("Employee Name : "+ e.getName());
				System.out.println("Employee ID : "+ e.getEmpId());
				System.out.println("Salary : "+ e.getSalary());
				System.out.println();
			}
		}
		System.out.println("*****************************************");
	}
	public Employee getEmployee(String empId)
	{
		Employee e = null;
		
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				if(employees[i].getEmpId().equals(empId))
				{
					e = employees[i];
					break;
				}
			}
		}
		if(e != null)
		{
			System.out.println("Employee Found");
		}
		else
		{
			System.out.println("Employee Not Found");
		}
		return e;
	}

	

}
