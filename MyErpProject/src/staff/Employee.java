package staff;

/**
 * Class Invariant: All objects have a name string. A name string of "No name"
 * indicates no real name specified yet.
 */
public abstract class Employee
{
	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;

	private String name;

	/**
	 * Default constructor. Postcondition: set default name to "No name"
	 */
	public Employee()
	{
		name = "No name";
	}

	/**
	 * Constructor use to set theName. Precondition: theName is not null.
	 */
	public Employee(String theName)
	{
		assert (name != null);
		name = theName;
	}

	/**
	 * Copy constructor. Precondition: originalObject is not null.
	 */
	public Employee(Employee originalObject)
	{
		assert (originalObject != null);
		name = originalObject.name;
	}

	/**
	 * Returns the name.
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Set name to newName. Precondition: newName is not null.
	 */
	public void setName(String newName)
	{
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
