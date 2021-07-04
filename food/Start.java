import java.lang.*;
import java.util.*;
import classes.*;
import interfaces.*;
import fileio.*;

public class Start 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		FoodCourt b = new FoodCourt();
		FileReadWriteDemo frwd = new FileReadWriteDemo();

		System.out.println("-----***********  Welcome to Food Court Management Application: ************-----");

		boolean repeat = true;

		while(repeat)
		{
			System.out.println("What do you want to do?\n");
			System.out.println("	1. Employee Management");
			System.out.println("	2. Restaurant Management");
			System.out.println("	3. Restaurant FoodItem Management");
			System.out.println("	4. FoodItem Quantity Add-Sell ");
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
					System.out.println("	2. Get an Employee");
					System.out.println("	3. Removing an Existing Employee");
					System.out.println("	4. Show All Employees");
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

							b.insertEmployee(e1);

							System.out.println("########################");
							break;

						case 2:

							System.out.println("########################");
							System.out.println("Get An Employee");

							System.out.print("Enter Employee ID: ");
							String empId2 = sc.next();

							Employee e2 = b.getEmployee(empId2);

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

						case 3:

							System.out.println("########################");
							System.out.println("Remove an Existing Employee");

							System.out.print("Enter Employee ID: ");
							String empId3 = sc.next();

							Employee e3 = b.getEmployee(empId3);

							if(e3 != null)
							{
								b.removeEmployee(e3);
							}
							System.out.println("########################");
							break;

						case 4:

							System.out.println("########################");
							System.out.println("Show All Employees");
							b.showAllEmployees();
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

				//--------------------------------------------------------------------------------------------

				case 2:

					System.out.println("--------------------------------");
					System.out.println("You have choosen Restaurant Management");

					System.out.println("Choose any one Option from the followings:\n");
					System.out.println("	1. Insert New Restaurant");
					System.out.println("	2. Get a Restaurant");
					System.out.println("	3. Removing an Existing Restaurant");
					System.out.println("	4. Show All Restaurants");
					System.out.println("	5. Go Back\n");

					System.out.print("Your Option: ");
					int option2 = sc.nextInt();

					switch(option2)
					{
						case 1:

							System.out.println("########################");
							System.out.println("Insert New Restaurant");

							System.out.print("Enter Restaurant  rid : ");
							String rid1 = sc.next();
							System.out.print("Enter Restaurant Name: ");
							String name1 = sc.next();


							Restaurant c1 = new Restaurant();
							c1.setRid(rid1);
							c1.setName(name1);

							b.insertRestaurant(c1);

							System.out.println("########################");
							break;

						case 2:

							System.out.println("########################");
							System.out.println("Get A Restaurant");

							System.out.print("Enter Restaurant  rid : ");
							String rid2 = sc.next();

							Restaurant c2 = b.getRestaurant(rid2);

							if(c2 !=null)
							{
								System.out.println();
								System.out.println("Restaurant  rid : "+c2.getRid());
								System.out.println("Restaurant Name: "+c2.getName());
								c2.showAllFoodItems();
								System.out.println();
							}

							System.out.println("########################");
							break;

						case 3:

							System.out.println("########################");
							System.out.println("Remove an Existing Restaurant");

							System.out.print("Enter Restaurant  rid : ");
							String rid3 = sc.next();

							Restaurant c3 = b.getRestaurant(rid3);

							if(c3 != null)
							{
								b.removeRestaurant(c3);
							}
							System.out.println("########################");
							break;

						case 4:

							System.out.println("########################");
							System.out.println("Show All Restaurants");
							b.showAllRestaurants();
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
//----------------------------------------------------------------------------------------------------------------
				case 3:

					System.out.println("--------------------------------");
					System.out.println("You have choosen Restaurant FoodItem Management");

					System.out.println("Choose any one Option from the followings:\n");
					System.out.println("	1. Insert New FoodItem for a Restaurant");
					System.out.println("	2. Get an FoodItem of a Restaurant");
					System.out.println("	3. Removing an Existing FoodItem of a Restaurant");
					System.out.println("	4. Show All FoodItem of all Restaurants");
					System.out.println("	5. Go Back\n");

					System.out.print("Your Option: ");
					int option3 = sc.nextInt();

					switch(option3)
					{
						case 1:

							System.out.println("########################");
							System.out.println("Insert New FoodItem for a Restaurant\n");

							FoodItem a = null;

							System.out.println("Which type of FoodItem do you want to Create?\n");
							System.out.println("	1. Appetiziers ");
							System.out.println("	2. MainDish  ");
							System.out.println("	3. Go Back");

							System.out.print("Enter Type: ");
							int type = sc.nextInt();

							if(type == 1)
							{
								Appetiziers sa = new Appetiziers();

								System.out.print("Enter FoodItem name: ");
								String an1 = sc.next();
								System.out.print("Enter fid: ");
								String b1 = sc.next();
								System.out.print("Enter Available Quantity: ");
								int ir1 = sc.nextInt();
							     System.out.print("Enter price: ");
								double pr = sc.nextDouble();
								System.out.print("Enter size: ");
								String sz = sc.next();

								sa.setName(an1);
								sa.setFid(b1);
								sa.setAvailableQuantity(ir1);
                                sa.setPrice(pr);
								sa.setSize(sz);
								a = sa;

							}
							else if(type == 2)
							{
								MainDish fa = new MainDish();

								System.out.print("Enter FoodItem name: ");
								String an1 = sc.next();
								System.out.print("Enter fid: ");
								String b1 = sc.next();
								System.out.print("Enter Available Quantity: ");
								int ir1 = sc.nextInt();
							     System.out.print("Enter price: ");
								double pr = sc.nextDouble();
								System.out.print("Enter Category: ");
								String cat = sc.next();

								fa.setName(an1);
								fa.setFid(b1);
								fa.setAvailableQuantity(ir1);
                                fa.setPrice(pr);
								fa.setCategory(cat);
								a = fa;

							}
							else if(type == 3)
							{
								System.out.println("Going Back.......");
							}
							else
							{
								System.out.println("Invalid Type");
							}

							if(a!= null)
							{
								System.out.print("Enter Restaurant  rid : ");
								String rid1 = sc.next();
								b.getRestaurant(rid1).insertFoodItem(a);
							}
							System.out.println("########################");
							break;

						case 2:

							System.out.println("########################");
							System.out.println("Get an FoodItem of a Restaurant\n");

							System.out.print("Enter Restaurant  rid : ");
							String rid2 = sc.next();
							System.out.print("Enter FoodItem name: ");
							String an2 = sc.next();

							FoodItem a2 = b.getRestaurant(rid2).getFoodItem(an2);

							if(a2 != null)
							{
								a2.showInfo();
							}
							System.out.println("########################");
							break;

						case 3:

							System.out.println("########################");
							System.out.println("Remove an FoodItem of a Restaurant");

							System.out.print("Enter Restaurant  rid : ");
							String rid3 = sc.next();
							System.out.print("Enter FoodItem name: ");
							String an3 = sc.next();

							b.getRestaurant(rid3).removeFoodItem(b.getRestaurant(rid3).getFoodItem(an3));

							/*
							Restaurant c3 = b.getRestaurant( rid 3);
							if(c3 ! = null)
							{
								FoodItem a3 = c3.getFoodItem(an3);

								if(a3 ! = null)
								{
									c3.removeFoodItem(a3);
								}
							}
							else
							{
								System.out.println("Invalid Input");
							}
							*/
							System.out.println("########################");
							break;

						case 4:

							System.out.println("########################");
							System.out.println("Show All FoodItem of a Restaurant");

							System.out.print("Enter Restaurant  rid : ");
							String rid4 = sc.next();

							b.getRestaurant(rid4).showAllFoodItems();

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
//------------------------------------------------------------------------------------
				case 4:

					System.out.println("--------------------------------");
					System.out.println("You have choosen FoodItem Quantity Add-Sell");

					System.out.println("Choose any one Option from the followings:\n");
					System.out.println("	1. add Quantity Money");
					System.out.println("	2. sell Quantity Money");
					
					System.out.println("	4. Show Quantity Add-Sell History");
					System.out.println("	5. Go Back\n");

					System.out.print("Your Option: ");
					int option4 = sc.nextInt();

					switch(option4)
					{
						case 1:
							System.out.println("#########################");
							System.out.println("addQuantity ");
							System.out.print("Enter Restaurant  rid : ");
							String rid1 = sc.next();
							System.out.print("Enter FoodItem name: ");
							String an1 = sc.next();
							System.out.print("Enter  Quantity Amount: ");
							int amount1 = sc.nextInt();

							if(amount1>0)
							{
								b.getRestaurant(rid1).getFoodItem(an1).addQuantity(amount1);
								frwd.writeInFile("$"+amount1+" has been addQuantityed in FoodItem name "+ an1);
								//frwd.writeInFile("addQuantity: $"+amount1+" in "+an1);
							}
							System.out.println("#########################");
							break;

						case 2:

							System.out.println("#########################");
							System.out.println("sellQuantity Money");
							System.out.print("Enter Restaurant  rid : ");
							String rid2 = sc.next();
							System.out.print("Enter FoodItem name: ");
							String an2 = sc.next();
							System.out.print("Enter sell Quantity Amount: ");
							int amount2 = sc.nextInt();

							if(amount2>0 && amount2<=b.getRestaurant(rid2).getFoodItem(an2).getAvailableQuantity())
							{
								b.getRestaurant(rid2).getFoodItem(an2).sellQuantity(amount2);
								frwd.writeInFile("$"+amount2+" has been sellQuantityn from FoodItem name "+ an2);
							}
							System.out.println("#########################");
							break;

						

						case 3:

							System.out.println("#########################");
							System.out.println("Show Transaction History\n");
							frwd.readFromFile();
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


	}
}
