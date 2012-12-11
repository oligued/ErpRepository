package staff;

/**
 * Class Invariant: All objects have a name string, nonnegative wage rate, and
 * nonnegative number of hours worked. A name string of "No name" indicates no
 * real name specified yet.
 */
public class HourlyEmployee extends Employee
{
	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;

	private double wageRate;
	private double hours; // for the month

	public HourlyEmployee()
	{
		super();
		wageRate = 0;
		hours = 0;
	}

	/**
	 * Precondition: theName is not null; theWageRate and theHours are
	 * nonnegative.
	 */
	public HourlyEmployee(String theName, double theWageRate, double theHours)
	{
		super(theName);

		assert ((theWageRate >= 0) && (theHours >= 0));

		wageRate = theWageRate;
		hours = theHours;
	}

	/**
	 * Precondition: originalObject is not null;
	 */
	public HourlyEmployee(HourlyEmployee originalObject)
	{
		super(originalObject);
		wageRate = originalObject.wageRate;
		hours = originalObject.hours;
	}

	/**
	 * Returns the wage rate. Postcondition: wageRate is nonnegative;
	 */
	public double getRate()
	{
		return wageRate;
	}

	/**
	 * Returns the hours worked. Postcondition: hours is nonnegative;
	 */
	public double getHours()
	{
		return hours;
	}

	/**
	 * Returns the pay for the month. Postcondition: pay is nonnegative;
	 */
	public double getPay()
	{
		return wageRate * hours;
	}

	/**
	 * Set the working hour. Precondition: hoursWorked is nonnegative.
	 */
	public void setHours(double hoursWorked)
	{
		assert (hoursWorked >= 0);

		hours = hoursWorked;
	}

	/**
	 * Set the wage rate. Precondition: newWageRate is nonnegative.
	 */
	public void setRate(double newWageRate)
	{
		assert (newWageRate >= 0);

		wageRate = newWageRate;
	}

	public String toString()
	{
		return (getName() + " " + "\n$" + wageRate + " per hour for " + hours + " hours");
	}

	public boolean equals(HourlyEmployee other)
	{
		return (getName().equals(other.getName()) && wageRate == other.wageRate && hours == other.hours);
	}
}