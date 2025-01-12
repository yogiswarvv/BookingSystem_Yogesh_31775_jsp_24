import java.util.Random;

public class Book {
	private String id;
	private String title;
	private int cost;
	private int noOfPages;
	private String author;
	
	
	public Book(String title,int cost,int noOfPages,String author)
	{
		Random r=new Random();
		
		String fs;
		if(title.length()>=3)
		{
			fs=title.substring(0, 3);
		}
		else
		{
			fs=title;
		}
		int ran=r.nextInt(999);
		this.id=fs+ran;
		if(validateTitle(title))
		{
			this.title=title;
		}
		else
		{
			throw new invalidTitleException();
		}
		if(validateCost(cost))
		{
			this.cost=cost;
		}
		else
		{
			throw new invalidCostException();
		}
		if(validateNoOfPages(noOfPages))
		{
			this.noOfPages=noOfPages;
		}
		else
		{
			throw new invalidPageException();
		}
		if(validateAuthor(author))
		{
			this.author=author;
		}
		else
		{
			throw new InvalidNameExce();
		}
		
	}
	public boolean containsDigit(String s)
	{
		for(char c:s.toCharArray())
		{
			if(Character.isDigit(c))
			{
				return true;
			}
		}
		return false;
	}
	public boolean validateTitle(String s)
	{
		String [] s1=s.split("_");
		if(s1.length==2)
		{
			if(s.length()>=7 && containsDigit(s) && s.contains("_"))
			{
				return true;
			}
		}
		return false;
	}
	public boolean validateCost(int n)
	{
		if(n>=200 && n<=1000)
		{
			return true;
		}
		return false;
	}
	public boolean validateNoOfPages(int n)
	{
		if(n>=100 && n<=400)
		{
			return true;
		}
		return false;
	}
	public boolean validateAuthor(String s) {
    String[] s1 = s.split(" ");
    if (s1.length == 2) {
		if (s1[0].charAt(0) >= 'A' && s1[0].charAt(0) <= 'Z') {
            if (s1[1].charAt(0) >= 'A' && s1[1].charAt(0) <= 'Z') {
                return true;
            }
        }
    }
    return false;
}



	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getNoOfPages() {
		return noOfPages;
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "id=" + id + "\n title=" + title + "\n cost=" + cost + "\n noOfPages=" + noOfPages + "\n author="
				+ author + "\n ---------------------------";
	}
	
	
	
	public void display()
	{
		System.out.println("Title : "+getTitle());
		System.out.println("ID : "+getId());
		System.out.println("Cost : "+getCost());
		System.out.println("noofpages : "+getNoOfPages());
		System.out.println("author : "+getAuthor());
	}
}
