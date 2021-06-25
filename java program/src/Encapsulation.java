class CompanyInfo{
	private String Employee,name;
	private int salary;

CompanyInfo(String Employee,String name,int salary)
{ this.Employee=Employee;
  this.name=name;
  this.salary=salary;
  }
public String getEmployee()
{return Employee;}
public String getname()
{return name;}
public int getsalary()
{return salary;}
public void setsalary(int a)
{salary=a;}
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CompanyInfo c1= new CompanyInfo("VaibhavGupta","Fiserv",80000);
System.out.println("Employee="+c1.getEmployee());
System.out.println("Name="+c1.getname());
System.out.println("Salary="+c1.getsalary());

CompanyInfo c2= new CompanyInfo("VaibhavGupta","Fiserv",80000);
System.out.println("Employee="+c2.getEmployee());
System.out.println("Name="+c2.getname());
 c2.setsalary(95000); 
System.out.println("Salary="+c2.getsalary());

	}

}
