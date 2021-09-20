class Sample
{

	public  int recursiveApproch(int[] weights, int[] profits, 
		int currentIndex, int capacity)
	{
		int n = weights.length;

		if(currentIndex >= n || capacity == 0)
		{
			return 0;
		}

		if(weights[currentIndex] <= capacity)
		{
			// FindOut profit1 with including currentItem

			int profit1 = profits[currentIndex] +
							recursiveApproch(weights,profits,
								currentIndex+1, 
								capacity - weights[currentIndex]);

			// Findout profit2 without including currentItem
			int profit2 = recursiveApproch(weights,profits,
				currentIndex+1, capacity);

			// return max out of it.
			return profit1 > profit2 ? profit1 : profit2;

		}else // it means weights[currentIndex] > capacity
		{
			// Find out profit without including item. then return it.
			return recursiveApproch(weights,profits,currentIndex+1,capacity);
		}
	}
}

public class KnapsackProblem01
{
	public static void main(String args[])
	{
		int[] weights = {1,2,3};
		int[] profits = {5,2,4};
		int currentIndex = 0;
		int capacity = 5;

		Sample s = new Sample();
		int maxProfit = s.recursiveApproch(weights,profits,currentIndex,capacity);

		System.out.println(" MaxProfit :: "+maxProfit);
	}
}











