import java.util.Arrays;

//Saurabh Bansal
public class ArrayMethods1 
{
	public static void main (String [] args) //Tester
	{
		//Testing Arrays
		int [] L2 = {1, 4, 4, 5, 2, 4, 3, 17, 0};
		double [] L3 = {1.1, 4.1, 4.2, 5.0, 2.0, 4.0, 3.0, 17.0, 0.0};
		String [] L1 = {"zebra" , "tortilla" , "abba" , "foo", "bar", "aba"};
						
		//Insertion Sort
		for (int y : L2)
		{
			System.out.print(y + "," + " ");
		}
		insertionSort(L2);
		System.out.println();
		for (int y : L2)
		{
			System.out.print(y + "," + " ");
		}
		System.out.println();
		System.out.println();
		
		//Selection Sort
		
		for (double y : L3)
		{
			System.out.print(y + "," + " ");
		}
		selectionSort(L3);
		System.out.println();
		for (double y : L3)
		{
			System.out.print(y + "," + " ");
		}
		System.out.println();
		System.out.println();
		
		// Bubble Sort
		for (String x : L1)
		{
			System.out.print(x + "," + " ");
		}
		bubbleSort(L1);
		System.out.println();
		for (String x : L1)
		{
			System.out.print(x + "," + " ");
		}
		System.out.println();
		System.out.println();
		
		//Insertion Sort Test
		long start = System.nanoTime();
		insertionSort(L2);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Insertion took: " + time + " nanoseconds");
		System.out.println(Arrays.toString(L2));
		System.out.println();
		System.out.println();
		
		//Selection Sort Test
		start = System.nanoTime();
		selectionSort(L3);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Selection took: " + time + " nanoseconds");
		System.out.println(Arrays.toString(L3));
		System.out.println();
		System.out.println();
			
		//Bubble Sort Test
		start = System.nanoTime();
		bubbleSort(L1);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Bubble took: " + time + " nanoseconds");
		System.out.println(Arrays.toString(L1));				
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
			int c = i;
				for(int j = i; j < L1.length; j++) 
				{
					if(L1[j] < L1[c]) 
					{
						c = j;
					}
				}
			swapDouble(L1, i, c);
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