package day3;

public class SapXepArr 
{
	public static void SXtangdan(int[]arr) 
	{
		for (int t = 0; t < arr.length; t++) {
			
		
		for (int i = 0; i < arr.length-1; i++) 
		{
			if(arr[i] > arr[i+1]) 
			{
				int tmp = arr[i+1];
			    arr[i+1]= arr[i];
			    arr[i]= tmp;
			}
		}
		}
	}

	public static void main(String[] args) 
	{
		int[]arr = {68,45,57,24};
		SXtangdan(arr);
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+" ");
		}
	}

}