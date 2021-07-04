package Interfaces;
import Classes.*;

public interface EmployeeOperation
{
	void insertEmployee(Employee e);
	void removeEmployee(Employee e);
	Employee getEmployee(String empId);
	void showAllEmployees();
	
}