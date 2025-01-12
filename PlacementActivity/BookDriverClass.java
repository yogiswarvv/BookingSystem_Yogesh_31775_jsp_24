

import java.util.ArrayList;
import java.util.Iterator;



public class BookDriverClass {
	
	private ArrayList<Book> book=new ArrayList<Book>();

	private Book b;

	//add
	public void add(Book b)
	{
		book.add(b);
	}
	
	public void displayBookPages(int id,int n)
	{
		boolean isFound=false;
		if(book.isEmpty())
		{
			System.out.println("currently there are no student details in our data base to display");
		}
		else
		{
			for(Book b:book)
			{
				if(b.getCost()==id && b.getNoOfPages()==n)
				{
					b.display();
					isFound=true;
				}
			}
		}
		if(!isFound)
		{
			throw new invalidDataEntered();
		}
	}
	public void displayTitlecaost(String n)
	{
		boolean isFound=false;
		if(book.isEmpty())
		{
			System.out.println("currently there are no student details in our data base to display");
		}
		else
		{
			Iterator<Book> itr=book.iterator();
			while(itr.hasNext())
			{
				Book b=itr.next();
				if(b.getId().equals(n))
				{
					System.out.println("Title : "+b.getTitle());
					System.out.println("Cost : "+b.getCost());
					isFound=true;
				}
			}
		
		}
		if(!isFound)
		{
			throw new invalidDataEntered();
		}
		
	}
	public void displaybooktitle(String s)
	{
		boolean isFound=false;
		if(book.isEmpty())
		{
			System.out.println("currently there are no student details in our data base to display");
		}
		else
		{
			for(Book b:book)
			{
				if(b.getTitle().equals(s))
				{
					System.out.println("Cost : "+b.getCost());
				}
			}
		}
		if(!isFound)
		{

			throw new invalidDataEntered();
		}
	}
	public void updateAuthorCost(String s)
	{
		boolean isFound=false;
		if(book.isEmpty())
		{
			System.out.println("currently there are no student details in our data base to display");
		}
		else
		{
			Iterator<Book> itr=book.iterator();
			while(itr.hasNext())
			{
				Book b=itr.next();
				if(b.getTitle().equals(s))
				{
					
					b.setAuthor("Yogesh Kancarla");
					b.setCost(800);
					System.out.println("Author : "+b.getAuthor());
					System.out.println("Cost : "+b.getCost());
					isFound=true;
				}
			}
		}
		if(!isFound)
		{
			throw new invalidDataEntered();
		}
		
	}
	public void removebasedontitle(String s)
	{
		boolean isFound=false;
		if(book.isEmpty())
		{
			System.out.println("currently there are no student details in our data base to display");
		}
		else
		{
			Iterator<Book> itr=book.iterator();
			while(itr.hasNext())
			{
				Book b=itr.next();
				if(b.getTitle().equals(s))
				{
					itr.remove();
					isFound=true;
				}
			}
		}
		if(!isFound)
		{
			throw new invalidDataEntered();
		}
	}
	public void removeBookauthorcost(String s,int c)
	{
		boolean isFound=false;
		if(book.isEmpty())
		{
			System.out.println("currently there are no student details in our data base to display");
		}
		else
		{
			Iterator<Book> itr=book.iterator();
			while(itr.hasNext())
			{
				Book b=itr.next();
				if(b.getAuthor().equals(s) && b.getCost()==c)
				{
					itr.remove();
					isFound=true;
				}
			}
		}
		if(!isFound)
		{
			throw new invalidDataEntered();
		}
	}

	

}
