import java.lang.*;
import java.util.*;
import Classes.*;
import Interfaces.*;
import fileio.*;

public class Start
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		Market m = new Market();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		
		System.out.println("-----------------Welcome to our Market Management Application Application-------------------");
	
		boolean repeat = true;
		
		while(repeat)
		{
				
			System.out.println("What do you want to do?\n");
			System.out.println("	1. Employee Management");
			System.out.println("	2. Shop Management");
			System.out.println("	3. Shop Product Management");
			System.out.println("	4. Product Quantity Add-sell");
			System.out.println("	5. Exit\n");
	
 				System.out.print("Your Choice: ");
				int choice = sc.nextInt();
				
				
				switch(choice)
				{
				   case 1:
					
						System.out.println("--------------------------------");
						System.out.println("You have choosen Employee Management");
						
						System.out.println("Choose any one Option from the followings\n");
						System.out.println("	1. Insert New Employee");
						System.out.println("	2. Removing an Existing Employee ");
						System.out.println("	3. Show All Employees");
						System.out.println("	4. Search an Employee");
						System.out.println("	5. Go Back\n");
						
						System.out.print("Your Option: ");
						int option1 = sc.nextInt();
						
						switch(option1)
						{
							case 1:
	
								System.out.println("########################");
								System.out.println("Insert New Employee");
								
								System.out.print("Enter Employee ID: ");
								String empId1 = sc.next();
								System.out.print("Enter Employee Name: ");
								String name1 = sc.next();
								System.out.print("Enter Employee Salary: ");
								double salary1 = sc.nextDouble();
								
							    Employee e1 = new Employee();
							    e1.setEmpId(empId1);
								e1.setName(name1);
								e1.setSalary(salary1);
								
								m.insertEmployee(e1);
								
								System.out.println("########################");
								break;
								
							case 2:
							
								System.out.println("########################");
								System.out.println("Remove an  Employee");
								
								System.out.print("Enter Employee ID: ");
								String empId3 = sc.next();
								
								Employee e3 = m.getEmployee(empId3);
								
								if(e3 != null)
								{
									m.removeEmployee(e3);
								}
								System.out.println("########################");
								break;
								
							case 3:
							
								System.out.println("########################");
								System.out.println("Show All Employees");
								m.showAllEmployees();
								System.out.println("########################");
								break;
								
							case 4:
								System.out.println("########################");
								System.out.println("Get An Employee");
								
								System.out.print("Enter Employee ID: ");
								String empId2 = sc.next();
								
								Employee e2 = m.getEmployee(empId2);
								
								if(e2 !=null)
								{
									System.out.println();
									System.out.println("Employee ID: "+e2.getEmpId());
									System.out.println("Employee Name: "+e2.getName());
									System.out.println("Employee Salary: "+e2.getSalary());
									System.out.println();
								}
								
								System.out.println("########################");
								break;
								
								
							case 5:
							
								System.out.println("########################");
								System.out.println("Going Back......");
								System.out.println("########################");
								break;
								
							default:
							
								System.out.println("########################");
								System.out.println("Invalid Option");
								System.out.println("########################");
								break;
						}
						
						System.out.println("--------------------------------");
						break;
						
				case 2:
				
					System.out.println("--------------------------------");
					System.out.println("You have choosen Shop Management");
					
					System.out.println("Choose any one Option from the followings:\n");
					System.out.println("	1. Insert New Shop");
					System.out.println("	2. Removing an Existing Shop");
					System.out.println("	3. Show All Shops ");
					System.out.println("	4. Search a Shop");
					System.out.println("	5. Go Back\n");
					
					System.out.print("Your Option: ");
					int option2 = sc.nextInt();
					
					switch(option2)
					{
						case 1:
						
							System.out.println("########################");
							System.out.println("----Insert New Shop----");
							
							System.out.print("Enter shop SID: ");
							String sid1 = sc.next();
							System.out.print("Enter Shop Name: ");
							String name1 = sc.next();
							
							
							Shop s1 = new Shop();
							s1.setSid(sid1);
							s1.setName(name1);
						
							m.insertShop(s1);
							
							System.out.println("########################");
							break;
							
						case 2:
							
							System.out.println("########################");
							System.out.println("----Remove an Existing Customer----");
							
							System.out.println("Enter shop SID :");
							String sid3 = sc.next();
							
							Shop s3=m.getShop(sid3);
							
							if (s3 != null) 
							{
								m.removeShop(s3);
								
							}
							System.out.println("########################");
							break;
							
							
						case 3:
						
							System.out.println("########################");
							System.out.println("----Show All shops----");
							m.showAllShops();
							System.out.println("########################");
							break;
							
							
						case 4:
							System.out.println("########################");
							System.out.println("----Search A Shop----");
							
							System.out.print("Enter shop SID : ");
							String sid2 = sc.next();
							
							Shop s2 = m.getShop(sid2);
							
							if(s2 != null)
							{
								System.out.println();
								System.out.println("Shop SID : "+s2.getSid());
								System.out.println("Shop Name : "+s2.getName());
								s2.showAllProducts();
								System.out.println();
							}
							
							System.out.println("########################");
							break;
							
						case 5:
						
							System.out.println("########################");
							System.out.println("Going Back......");
							System.out.println("########################");
							break;
							
						default:
						
							System.out.println("########################");
							System.out.println("Invalid Option");
							System.out.println("########################");
							break;
					}
					
					System.out.println("--------------------------------");
					break;
				
				case 3:
				
					System.out.println("--------------------------------");
					System.out.println("You have choosen Shop Product Management");
					
					System.out.println("Choose any one Option from the followings:\n");
					System.out.println("	1. Insert New Product");
					System.out.println("	2. Removing an Existing Product");
					System.out.println("	3. Show All Product");
					System.out.println("	4. Search product");
					System.out.println("	5. Go Back\n");
					
					System.out.print("Your Option: ");
					int option3 = sc.nextInt();
					
					switch(option3)
					{
						case 1:
						
							System.out.println("########################");
							System.out.println("Insert New product\n");
							
							Product p = null;
							
							System.out.println("Which type of Product do you want to creat?\n");
							System.out.println("	1. Local product");
							System.out.println("	2. ImportedProduct");
							System.out.println("	3. Go Back");
							
							System.out.print("Enter Type: ");
							int type = sc.nextInt();
							
							if(type == 1)
							{
								LocalProduct lp = new LocalProduct();
								
								System.out.print("Enter Product PID: ");
								String pid1 = sc.next();
								System.out.print("Enter Product name: ");
								String pn1 = sc.next();
								
								try{
									System.out.print("Enter available Quantity : ");
									int aq1 = sc.nextInt();
									System.out.print("Enter Discount Rate: ");
									double dr1 = sc.nextDouble();
									System.out.print("Product price :");
									double p1 =sc.nextDouble();
									lp.setAvailableQuantity(aq1);
									lp.setPrice(p1);
								    lp.setDiscountRate(dr1);
								}
								catch(InputMismatchException e)
								{
									System.out.println("InputMismatchException occur !!!");
									
								}
								
								lp.setPid(pid1);
								lp.setName(pn1);
								
								
								p = lp;
								
							}
							else if(type == 2)
							{
								ImportedProduct ip = new ImportedProduct();
								
								System.out.print("Enter Product PID: ");
								String pid2 = sc.next();
								System.out.print("Enter Product name: ");
								String pn2 = sc.next();
								
								try{
								System.out.print("Enter available Quantity : ");
								int aq2 = sc.nextInt();
								System.out.print("Product price : ");
								double p2 = sc.nextDouble();
								ip.setAvailableQuantity(aq2);
								ip.setPrice(p2);
								}
								catch(InputMismatchException e)
								{
									System.out.println("Please give an integer number");
								}
								
								System.out.print("Enter Country name : ");
								String cn1 = sc.next();
								
								ip.setName(pn2);
								ip.setPid(pid2);
								ip.setCountryName(cn1);
		
								p = ip;
								
							}
							else if(type == 3)
							{
								System.out.println("Going Back.......");
							}
							else
							{
								System.out.println("Invalid Type");
							}
							
							if(p!= null)
							{
								System.out.print("Enter Shop NID: ");
								String sid4 = sc.next();
				            try {
				            	m.getShop(sid4).insertProduct(p);
								
							} catch (NullPointerException e) {
								System.out.println("NullPointer Exception Occur!!!! ");
							}
								
							}
							System.out.println("########################");
							break;
							
						case 2:
							System.out.println("########################");
							System.out.println("----Remove  product -----");
							
							System.out.print("Enter shop SID : ");
							String sid6 = sc.next();
							System.out.print("Enter product PID : ");
							String pid4 = sc.next();
							
			                   try {
								
			                	   m.getShop(sid6).removeProduct(m.getShop(sid6).getProduct(pid4));
							} catch (NullPointerException e)
							{
								System.out.println("NullPointer Exception Occur!!!! ");
							}
									
						
						
					
							System.out.println("########################");
							break;
							
							
						case 3:
							System.out.println("########################");
							System.out.println("----Show all Product---- ");
							
							System.out.print("Enter shop SID: ");
							String sid7 = sc.next();
							try {
								
								m.getShop(sid7).showAllProducts();
							} catch (NullPointerException e) {
								
							}
							
							System.out.println("########################");
							break;
							
						
						case 4: 
							System.out.println("########################");
							System.out.println("----Search a shop---- \n");
							
							System.out.print("Enter Product PID : ");
							String pid3 = sc.next();
							System.out.print("Enter shop SID : ");
							String sid5 = sc.next();
							
							try {
								
								Product p2 = m.getShop(sid5).getProduct(pid3);
							
							if (p2 != null)
							{
								p2.showInfo();
							}
                              } catch (NullPointerException e) {
								
							}
							
							System.out.println("########################");
							break;
							
							
						case 5:
						
							System.out.println("########################");
							System.out.println("Going Back..");
							System.out.println("########################");
							break;
							
						default:
						
							System.out.println("########################");
							System.out.println("Invalid Option");
							System.out.println("########################");
							break;
					}
					System.out.println("--------------------------------");
					break;
					
				case 4:
				
					System.out.println("--------------------------------");
					System.out.println("You have choosen product Quantity Add-sell");
					
					System.out.println("Choose any one Option from the followings:\n");
					System.out.println("    1. Add Product");
					System.out.println("    2. Sell-product");
					System.out.println("    3. Show Add-Sell History");
					System.out.println("    4. Go Back");
					
					System.out.print("Your Option: ");
					int option4 = sc.nextInt();
					
					switch(option4)
					{
						case 1:
							System.out.println("#########################");
							System.out.println("Add product");
							
							System.out.print("Enter product PID : ");
							String pd6 = sc.next();
							System.out.print("Enter product name : ");
							String pn4 = sc.next();
							System.out.print("Enter Shop Sid : ");
							String sid8 = sc.next();
						
							System.out.print("Enter amount : ");
							int amount1 = sc.nextInt();
							System.out.print("Enter available quantity : ");
							int av1 = sc.nextInt();
							
							
							if(amount1>0)
							{
								try {
									
									m.getShop(sid8).getProduct(pd6).addQuantity(amount1);
									
								} catch (NullPointerException e) {
									System.out.println("NullPointer Exception Occur!!!! ");
								}
								try {
									frwd.writeInFile(amount1+" number of product has been add in product PID "+ pd6 );
									
								} catch (Exception e) {
									System.out.println("File not found Exception occur!!!");
								}
								
							}
							System.out.println("#########################");
							break;
							
						case 2:
						
							System.out.println("#########################");
							System.out.println("sell product");
							
							System.out.print("Enter shop SID :");
							String sid9 = sc.next();
							System.out.print("Enter product PID : ");
							String pd7 = sc.next();
							System.out.print("Enter product name : ");
							String pn5 = sc.next();
							System.out.print("Enter sell amount : ");
							int amount3 = sc.nextInt();
							System.out.print("Enter available quantity : ");
							int av2 = sc.nextInt();
							
							System.out.println("");
							
                            try {
								
                            	if(amount3>0 && amount3<=m.getShop(sid9).getProduct(pd7).getAvailableQuantity())
                            	{
                            		
                            		m.getShop(sid9).getProduct(pd7).sellQuantity(amount3);
                            	} 
                            	
							} catch (NullPointerException e) {
								System.out.println("NullPointer Exception Occur!!!! ");
							}
                            try 
                            {
                            	frwd.writeInFile(amount3+" number of product has been sell from Product PID "+ pd7);
                            	
							} catch (Exception e) {
								System.out.println("File not found  Exception Occur!!!! ");
							}
                           
							System.out.println("#########################");
							break;
						
		
						case 3:
						
							System.out.println("#########################");
							System.out.println("Show Transaction History\n");
							try {
								
								frwd.readFromFile();
								
							} catch (Exception e) {
								System.out.println("File not found Exception occur!!!");
							}
							System.out.println("\n#########################");
							break;
							
						case 4:
						
							System.out.println("#########################");
							System.out.println("Going Back");
							System.out.println("#########################");
							break;
							
						default:
						
							System.out.println("#########################");
							System.out.println("Invalid Option");
							System.out.println("#########################");
							break;
						
					}
					
					System.out.println("--------------------------------");
					break;
					
				case 5:
				
					System.out.println("--------------------------------");
					System.out.println("You have choosen to Exit");
					repeat = false;
					System.out.println("--------------------------------");
					break;
					
				default:
				
					System.out.println("--------------------------------");
					System.out.println("Invalid Choice");
					System.out.println("--------------------------------");
					break;
					
			      }
					
		}	
		System.out.println("----------------------THANK YOU FOR USING OUR APPLICATION-------------------------");
	}
	
}

