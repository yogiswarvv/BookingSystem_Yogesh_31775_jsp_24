class invalidPageException extends RuntimeException 
{
	public String toString()
	{
		return getClass()+" : you have to enter the range between 100 to 400";
	}
}
