package Com;

public class Program2 {

	public static void main(String[] args) {
		String s=new String("j12sp45");
		
		String s1="";
		for(int i =0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9')
			{
				s1=s1+ch;
			}
		}
		
		String rev="";
		for(int i=s1.length()-1;i>=0;i--) {
			rev=rev+s1.charAt(i);
		}
		
		String s4="";
		int j=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isAlphabetic(ch))
			{
				s4=s4+ch;
			}
			else if(Character.isDigit(ch))
			{
				s4=s4+rev.charAt(j);
				j++;
			}
		}
		System.out.println(s4);

	}

}
