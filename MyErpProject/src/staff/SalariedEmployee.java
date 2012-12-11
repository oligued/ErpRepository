package staff;

/**
 * Class Invariant: All objects have a name string, hire date,
 * and nonnegative salary. A name string of "No name" indicates
 * no real name specified yet. A hire date of January 1, 1000 indicates
 * no real hire date specified yet.
 */
public class SalariedEmployee extends Employee
{
	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	private double salary; //annual
	
	/**
	 * Default constructor.
	 * Postcondition: set salary to 0 and call default constructor of base class
	 */
	public SalariedEmployee()
	{
		super();
		salary = 0;
	}
	
	/**
	 * Constructor use to set theName and theSalary.
	 * Precondition: theName is not null and theSalary is nonnegative.
	 */
	public SalariedEmployee(String theName, double theSalary)
	{
		super(theName);
		
		assert(theSalary >= 0);
		salary = theSalary;
	}
	
	/**
	 * Copy constructor.
	 * Precondition: originalObject is not null
	 */
	public SalariedEmployee(SalariedEmployee originalObject)
	{
		super(originalObject);
		
		assert(originalObject != null);
		salary = originalObject.salary;
	}

	/**
	 * Returns the pay for the year.
	 */
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
		assert(newSalary >= 0);
		salary = newSalary;
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