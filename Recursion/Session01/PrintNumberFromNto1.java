class Sample
{

	public void print(int n) // n = 5 => 5,4,3,2,1
	{
		if( n < 1)
		{
			return;
		}

System.out.println(n);
		print(n-1);
		

	}
}

public class PrintNumberFromNto1
{
	public static void main(String args[])
	{
			Sample s = new Sample();
			s.print(5);
	}
}




