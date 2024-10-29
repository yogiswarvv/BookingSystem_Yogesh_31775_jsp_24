class invalidDataEntered extends RuntimeException 
{
	public String toString()
	{
		return getClass()+" : Invalid data entered";
	}
}
