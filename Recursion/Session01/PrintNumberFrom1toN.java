class Sample
{

	public void print(int n) // n = 5 => 0<- 1,2,3,4,5
	{
		if( n < 1)
		{
			return;
		}

		print(n-1);
		System.out.println(n);

	}
}

public class PrintNumberFrom1toN
{
	public static void main(String args[])
	{
			Sample s = new Sample();
			s.print(5);
	}
}




