/*****************************************
* Author: Nick Foster
*
* Class processes name and salary
* information for an employee provided
* in test app; uses input validation to
* prevent negative salary amount.
*****************************************/

public class Employee {
   // fields
   private String firstName;
   private String lastName;
   private double salary;
	
	// constructors
   public Employee(String lastName, String firstName, double salary){
      this.lastName = lastName;
      this.firstName = firstName;
      setSalary(salary);
   }
 
   // methods
   public String getFirstName() {
      return firstName;
   }
   
   public String getLastName() {
      return lastName;
   }
   
   public double getSalary() {
      return salary;
   }
   
   public void setSalary(double salary) {
      if (salary >= 0)
         this.salary = salary;
   }

}