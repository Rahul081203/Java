public class pattern
{
	public static void main(String[] args)
	{
		int n=10;
		
		for (int i = n ; i >= 1 ; i--)
		{
			for (int k = 1 ; k <= i ; k++)
			{
				System.out.print("*");
			}
			for (int j = 1 ; j <= 2*(n-i) ; j ++)
			{
				System.out.print(" ");
			}
			for (int m = 1 ; m <= i ; m++)
			{
				System.out.print("*");
			}
			System.out.println(' ');
		}
		for (int i = 1; i <= n ; i++)
		{
			for (int k = 1 ; k <= i ; k++)
			{
				System.out.print("*");
			}
			for (int j = 1 ; j <= 2*(n-i) ; j ++)
			{
				System.out.print(" ");
			}
			for (int m = 1 ; m <= i ; m++)
			{
				System.out.print("*");
			}
			System.out.println(' ');
		}
		
	}
}