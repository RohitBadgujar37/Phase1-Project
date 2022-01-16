package projectQ;

public class Program9 {

	public static void main(String[] args) {
	
		int a[]=new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		System.out.println("One Dimention Array");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		int [] [] arr= {{11,20} ,{30,44}};
		System.out.println("Two Dimention Array");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				
				System.out.print(arr[i][j]);
				
			}
			System.out.println();
		}
		
	}


}
