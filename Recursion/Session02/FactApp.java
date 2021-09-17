class Sample
{

	/*
		Time Complexity : O(n)
		Space Complexity : O(n)
	*/
	public int fact(int n) // 5 * 4 * 3 * 2 * 1 = 120
	{
		if( n == 1)
		{
			return 1;
		}

		return n * fact(n-1);

			/*
					return 5 * fact(4) = 5 * 24 = 120
						return 4 * fact(3) = 4 * 6 = 24
							return 3 * fact(2) = 3 * 2 = 6
								return 2 * fact(1) = 2 * 1 = 2
									return 1
			*/
	}

		/*
			Time Complexity = O(n)
			Space Complexity = O(1)
		*/
	public int iterativeApproch(int n)
	{
		int result = 1;
		while(n > 1)
		{
			result = result * n;
					/*
						result = 1 * 5 = 5
						result = 5 * 4 = 20
						result = 20 * 3 = 60
						result = 60 * 2 = 120
						n = 1 > 1 loop terminates 
					*/
			n--;
		}

		return result;
	}
}

public class FactApp
{
	public static void main(String args[])
	{
		Sample s = new Sample();
		int result = s.fact(5);
		System.out.println(" fact(5) "+result);

		int result2 = s.iterativeApproch(5);
		System.out.println(" iterativeApproch(5) "+result2);
	}
}






