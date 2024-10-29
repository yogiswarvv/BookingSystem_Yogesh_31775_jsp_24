class invalidTitleException extends RuntimeException 
{
	public String toString()
	{
		return getClass()+" : the title has two words and min 7 letters and digit and underscore";
	}
}