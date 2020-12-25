package Practice;

public class d2 {

	public static void main(String[] args) {

		int n=5;
		
		for(int rows=0;rows<n;rows++)
		{
			int count=rows+1;
			int temp=n-1;
			for(int col=0;rows>=col;col++)
			{
				System.out.print(count+" ");		
				count=count+temp--;
				if(rows>col)
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

}
