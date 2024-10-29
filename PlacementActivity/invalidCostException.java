class invalidCostException extends RuntimeException 
{
	public String toString()
	{
		return getClass()+" : you have to enter the range between 300 to 1000";
	}
}
