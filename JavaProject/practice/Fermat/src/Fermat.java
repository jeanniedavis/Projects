import java.util.Random;
public class Fermat
{
	static Random rand= new Random();

	public static void main (String args[])
	{
		int n = rand.nextInt(Integer.MAX_VALUE)+1;
		int counter =0;
		int a = rand.nextInt(n-1)+1;

		System.out.println(fermatsRecurse( a, n, counter));
		
	}
	
	
	public static boolean fermatsRecurse(int a, int n, int counter)
	{
		if(a<n)
		{
			if((Math.pow(a, n) % n ) == a)
			{
				counter++;
					if(counter >1)
						return true;
				return fermatsRecurse(a,n, counter);
			}
		}
		return false;
	}

}
