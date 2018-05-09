package partitionProblem;

import java.util.Scanner;

/* Partition Problem
 * Solution: 
 * + Gọi P[i][j] có kiểu boolean, P[i][j] = true nếu tồn tại 1 tập con của tập {x1,x2,...,xj} có tổng bằng 
 * + Ta thấy : P[i][j] = true nếu P[i][j-1] = true hoặc P[i-arr[j]][j-1] = true 
 */
public class Main {
	static int n;		// so phan tu
	static int sumOfArr(int arr[])
	{
		int sum = 0;
		for (int i = 0; i < n; i++)
			sum += arr[i];
		
		return sum;
	}
	static boolean isPartition(int arr[])
	{
		int sum = sumOfArr(arr);
		if (sum % 2 != 0)
			return false;
		
		int s = sum/2;		// Target để tìm tập con có tổng bằng s
		boolean [][] P = new boolean[s+1][n+1];	
		
		//Khởi tạo hàng đầu tiên là true
		for(int j = 0; j < n+1; j++)
			P[0][j] = true;
		
		// Khởi tạo cột đầu tiên là false trừ P[0][0]
		for(int i = 1; i < s+1; i++)
			P[i][0] = false;
		
		for (int i = 1; i < s+1; i++)
			for (int j = 1; j < n+1; j++)
			{
				if (i - arr[j-1] >= 0)		
					P[i][j] = P[i][j-1] || P[i-arr[j-1]][j-1];
				
				else
					P[i][j] = P[i][j-1];
			}
		return P[s][n];
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Nhập số phần tử: ");
		n = in.nextInt();
		
		System.out.println("Nhập các phần tử:");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
		{
			arr[i] = in.nextInt();
		}
		
		boolean result = isPartition(arr);
		if (result == true)
			System.out.println("Có thể chia thành hai tập con có tổng bằng nhau.");
		else 
			System.out.println("Không thể chia thành hai tập con có tổng bằng nhau.");
	}
}
