class employeedetails{

   public String empname;
   private int empbasicsalary;
   private int empid;
   
   
 void displaygross(String name, int totalincome){
	empname = name;
	empbasicsalary = totalincome;
	int num;
	int gross;
	num = empbasicsalary*30/100;
  
  gross = empbasicsalary + num;
  System.out.println("The Name of the employee is:" + empname);
  System.out.println("The gross salary is :"+ gross);
  
 }
 
 }
 
 
public class objemployeesalary{
 
 
 public static void main(String args[]){
 

 
 employeedetails emp1;
 
 emp1 = new employeedetails();
 emp1.displaygross("Jitesh",50000);


 
 
 
 employeedetails emp2;
 
 emp2 = new employeedetails();
 emp2.displaygross("Suman",60000);

 
 
 
 employeedetails emp3;
 
 emp3 = new employeedetails();
 
 emp3.displaygross("Sayan",70000);
 
 }
 
 }
 
   
