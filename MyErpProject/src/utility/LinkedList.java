package utility;

/**
 * @author O.Guedat
 */
public class LinkedList<T_LinkedList>
{
	class Cell<T_Cell>
	{
		private T_Cell content;
		private Cell<T_Cell> next;

		protected Cell(T_Cell value, Cell<T_Cell> next)
		{
			content = value;
			this.next = next;
		}
	}

	private Cell<T_LinkedList> headCell;
	private int size;

	/**
	 * Default constructor. Refer the head cell to null and set size to 0.
	 */
	public LinkedList()
	{
		headCell = null;
		size = 0;
	}

	/**
	 * Predicate : Return true if the list is empty, else return false.
	 */
	public boolean isEmpty()
	{
		return (headCell == null);
	}

	/**
	 * Guettor : Retruns the number of elements store in the LinkedList
	 * 
	 * @return size
	 */
	public int getSize()
	{
		return size;
	}

	/**
	 * Mutator : Ajoute l'élément elem en tête de liste.
	 */
	public void addInHead(T_LinkedList element)
	{
		Cell<T_LinkedList> newCell = new Cell<>(element, headCell);
		headCell = newCell;
		size++;
	}

	/**
	 * Mutateur : Recherche et supprime (la première occurence de) l'élément
	 * elem s'il est dans la liste. Ne fait rien si l'élément elem n'est pas
	 * dans la liste. Precondition : LinkedList must not be empty Postcondition
	 * : ...
	 * 
	 */
	public void findAndDelete(T_LinkedList element)
	{
		assert (headCell != null);

		if (headCell.content.equals(element))
		{
			headCell = headCell.next;
			size = 0;
		}
		else
		{
			Cell<T_LinkedList> parsingCell = headCell;

			while ((parsingCell.next != null)
					&& (!parsingCell.next.content.equals(element)))
				parsingCell = parsingCell.next;
			if (parsingCell.next != null) // check if the next cell contain the
											// element to delete
			{
				parsingCell.next = parsingCell.next.next;
				size--;
			}
		}
	}

	/**
	 * Parcourt et affiche la liste. Précondition : Liste non-vide.
	 */
	public void showList()
	{
		Cell<T_LinkedList> parsingCell = headCell;

		while (parsingCell != null)
		{
			System.out.println("Element : " + parsingCell.content);
			parsingCell = parsingCell.next;
		}
	}
}