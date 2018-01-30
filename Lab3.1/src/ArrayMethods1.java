//Saurabh Bansal
public class ArrayMethods1 
{
	public static void main (String [] args)
	{
		String [] L1 = {"g" , "b" , "a" , "c", "d", "f", "e"};
		for (String x : L1)
		{
			System.out.print(x);
		}
		bubbleSort(L1);
		System.out.println();
		for (String x : L1)
		{
			System.out.print(x);
		}
		System.out.println();
		int [] L2 = {2, 4, 5, 7, 1, 4, 9, 3, 6};
		for (int y : L2)
		{
			System.out.print(y);
		}
		insertionSort(L2);
		System.out.println();
		for (int y : L2)
		{
			System.out.print(y);
		}
	}
	/*Side effects of all the methods is that they will all return 
	in ascending order, and they all return Void.*/
	public static void insertionSort(int []L2)
	{
		 for (int i = 1; i < L2.length; i++) 
	        {
	            for(int j = i ; j > 0 ; j--)
	            {
	                if(L2[j] < L2[j-1])
	                {
	                   swapInt(L2,j,(j-1));
	                }
	            }
	        }
	}
	public static void selectionSort(double []L1)
	{
		for(int i = 0; i < L1.length-1; i++) 
		{
			double m = L1[i];
			int c = i;
				for(int j = i; j < L1.length; j++) 
				{
					if(L1[j] < m) 
					{
						m = L1[j];
						c = j;
					}
				}
				if(m < L1[i]) 
				{
					swapDouble(L1, i, c);
				}
		} 	
	}
	public static void bubbleSort(String []L1)
	{
		boolean f = true;
		while (f)
		{
			f = false;
			for (int x = 0; x < L1.length - 1; x++)
			{
				if (L1[x].compareToIgnoreCase(L1[x+1]) > 0 )
				{
					swapString(L1, x, x+1);
					f = true;
				}
			}
		}
	}
	
	//Swap Methods
	public static void swapInt(int[]x, int in1, int in2)
	{
		int y = x[in1];
		x[in1] = x[in2];
		x[in2] = y;
	}
	public static void swapDouble(double[]x, int in1, int in2)
	{
		double y = x[in1];
		x[in1] = x[in2];
		x[in2] = y;
	}
	public static void swapString(String[]x, int in1, int in2)
	{
		String y = x[in1];
		x[in1] = x[in2];
		x[in2] = y;
	}
}