class Sample
{

	/*
				n = 8

			n/2

					n/4


				n/8 

				 log2^3 = 8

		Time Complexity = log(n)
		Space Complexity = log(n)

	*/

	public int recursiveSearch(int[] arr, int start , int end,int element)
	{
		if(start > end)
		{
			return -1;
		}

		int mid = start+ (end-start)/2; 
		if(arr[mid] == element)
		{
			return mid;
		}
		else if(arr[mid] > element)
		{
			end = mid - 1;
			return recursiveSearch(arr,start,end,element);
		}else // It means arr[mid] < element
		{
			start = mid+1;
			return recursiveSearch(arr,start,end,element);
		}
	}

	/*
		Time Complexity = log(n)
		Space Complexity = O(1)
	*/
	public int interationApproch(int[] arr, int element)
	{
		int start = 0; 
		int end = arr.length-1;  
		while(start <= end)
		{
			int mid = start + (end-start)/2;

			if(arr[mid] == element)
					{
						return mid;
					}
			else if(arr[mid] > element)
			{
				end = mid - 1;
			}else // It means arr[mid] < element
			{
				start = mid+1;
			}
		}

		return -1;
	}
}


public class BinarySearchApp
{
		public static void main(String args[])
		{
			Sample s = new Sample();
			int[] arr = {3,5,7,8,9,10,11,12};
			int start = 0;
			int end = arr.length-1;
			int element = 7;
			int index1  = s.recursiveSearch(arr, start, end,element);
			System.out.println( " recursiveSearch(7) => "+index1);

			int index2  = s.interationApproch(arr,element);
			System.out.println( " interationApproch(7) => "+index2);
		}
}





