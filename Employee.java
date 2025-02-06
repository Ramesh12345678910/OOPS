package mphasis.com.shape;
import java.util.*;
interface Employee1 {
       int salary();
}
class Manager implements Employee1{
	private int salary;
	public  Manager(int salary)
	{
		this.salary=salary;
	}
	public int salary() {
		salary+=100000;
		return salary;
	}
}
class Teamlead implements Employee1{
	private int salary;
	public Teamlead(int salary) {
		this.salary=salary;
	}
	public int salary() {
		salary+=500000;
		return salary;
	}
}
class Interns implements Employee1{
	private int salary;
	public Interns(int salary) {
		this.salary=salary;
	}
	public int salary()
	{
		salary+=10000;
		return salary;
	}
	
}

public class Employee{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int salary =sc.nextInt();
		Employee1 man=new Manager(salary);
		Employee1 tea=new Teamlead(salary);
		Employee1 in=new Interns(salary);
		System.out.println("The salary of the manager:"+man.salary());
		System.out.println("The salary of the teamleader:"+tea.salary());
		System.out.println("The salary of the interns:"+in.salary());
		sc.close();
	}
}