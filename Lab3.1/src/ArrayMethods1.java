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
		for (int x : L2)
		{
			System.out.print(x);
		}
		insertionSort(L2);
		System.out.println();
		for (int x : L2)
		{
			System.out.print(x);
		}
	}
	/*Side effects of all the methods is that they will all return 
	in ascending order, and they all return Void.*/
	public static void insertionSort(int []L2)
	{
		boolean s = true;
		while (s)
		{
			s = false;
			for (int x = 0; x < L2.length - 1; x++)
			{
				for (int j = x + 1; j < L2.length - 1; j++)
				if (L2[x] > (L2[j]))
				{
					swapInt(L2, x, j);
				}
				s = true;
			}
		}	
	}
	public static void selectionSort(double []L1)
	{
		
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