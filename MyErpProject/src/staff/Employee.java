package staff;

/**
 *	 Class Invariant: All objects have a name string and hire date.
 *	 A name string of "No name" indicates no real name specified yet.
 *	 A hire date of January 1, 1000 indicates no real hire date specified yet.
 */
public class Employee
{
	private String name;

	public Employee()
	{
		name = "No name";
	}

	/**
	 *	 Precondition: Neither theName nor theDate is null .
	 */
	public Employee(String theName)
	{
		if (theName == null)
		{
			System.out.println("Fatal Error creating employee.");
			System.exit(0);
		}
		name = theName;
	}

	public Employee(Employee originalObject)
	{
		name = originalObject.name;
	}

	public String getName()
	{
		return name;
	}

	/**
	 *	 Precondition newName is not null.
	 */
	public void setName(String newName)
	{
		if (newName == null)
		{
			System.out.println("Fatal Error setting employee name.");
			System.exit(0);
		}
		else
			name = newName;
	}

	public String toString()
	{
		return (name);
	}

	public boolean equals(Employee otherEmployee)
	{
		return (name.equals(otherEmployee.name));
	}
}
