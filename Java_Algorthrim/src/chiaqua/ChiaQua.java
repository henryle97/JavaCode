package chiaqua;

import java.util.Scanner;

public class ChiaQua {
	static final int MAX = 100;
	
	
	static Boolean recSub(int[] apple, int n, int sumWeight)
	{
		if (sumWeight == 0)
			return true;
		if (n == 0 && sumWeight != 0)
			return false;
		if (apple[n-1] > sumWeight)
			return recSub(apple, n-1, sumWeight);
		
		return recSub(apple, n-1, sumWeight) || recSub(apple, n-1, sumWeight - apple[n-1]);
	}
	static Boolean chiaQua(int[] apple, int n)
	{
		int sum = 0;
		for (int x : apple)
			sum += x;
		if ((sum / 100) % 2 != 0)
			return false;
		else
			return recSub(apple, n, sum / 2);
	}
	public static void main(String[] args)
	{
		int n; 			// so qua tao
		int[] apple;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		apple = new int[n];
		// Doc tu ban phim tren 1 dong		
		
		for (int i = 0; i < n; i++)
			apple[i] = input.nextInt();
		
		if (chiaQua(apple, n) == true )
			System.out.println("YES");
		else 
			System.out.println("NO");
		
	}
}
