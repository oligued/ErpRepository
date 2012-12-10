package staff;

/**
 * Class Invariant: All objects have a name string, hire date,
 * and nonnegative salary. A name string of "No name" indicates
 * no real name specified yet. A hire date of January 1, 1000 indicates
 * no real hire date specified yet.
 */
public class SalariedEmployee extends Employee
{
	private double salary; //annual
	public SalariedEmployee()
	{
		super();
		salary = 0;
	}
	/**
	 * Precondition: Neither theName nor theDate are null;
	 * theSalary is nonnegative.
	 */
	public SalariedEmployee(String theName, double theSalary)
	{
		super(theName);
		if (theSalary >= 0)
			salary = theSalary;
		else
		{
			System.out.println("Fatal Error: Negative salary.");
			System.exit(0);
		}
	}
	public SalariedEmployee(SalariedEmployee originalObject)
	{
		super(originalObject);
		salary = originalObject.salary;
	}
	public double getSalary()
	{
		return salary;
	}
	/**
	 * Returns the pay for the month.
	 */
	public double getPay()
	{
		return salary/12;
	}
	/**
	 * Precondition: newSalary is nonnegative.
	 */
	public void setSalary( double newSalary)
	{
		if (newSalary >= 0)
			salary = newSalary;
		else
		{
			System.out.println("Fatal Error: Negative salary.");
			System.exit(0);
		}
	}
	public String toString()
	{
		return (getName() + " " + "\n$" + salary + " per year");
	}
	public boolean equals(SalariedEmployee other)
	{
		return (getName().equals(other.getName())
				&& salary == other.salary);
	}
}