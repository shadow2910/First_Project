package p1;

public class ArrayClass {
	
	public static void main(String[] args) {
		
		int arr[] = {48,74,95,64};
		
		for (int i = 0; i < arr.length; i++) {
			int x = arr[i];
			System.out.println(x);
		}
		
		
		// --------------------
		
		for (int x : arr) {
			System.out.println(x);
		}
		
		System.out.println("--------------------------------------------");
		
		int arr2[][] = 
			{
					{45,58,95},
					{101,102,103},
					{77,88,99},
					{177,188,199},
					
			};
		
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				int x = arr2[i][j];
				System.out.print(x+" ");
			}
			System.out.print("\n");
		}
		System.out.println("__________________________________________");
		for(int[] x :arr2)
		{
			for(int y :x)
			{
				System.out.print(y+ " ");
			}System.out.print("\n");
		}
		
	}

}