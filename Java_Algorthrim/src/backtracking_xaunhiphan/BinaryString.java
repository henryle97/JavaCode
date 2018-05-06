package backtracking_xaunhiphan;

import java.util.Scanner;

public class BinaryString {
	static int[] B;
	static int n;
	
	static void Try(int k)
	{
		// Neu xau da hoan thanh thi in ra
		if (k == n) {
			for(int i = 0; i < n;i++)
				System.out.print(B[i]);
			System.out.println();
			return;
		}
		
		//Moi gia tri co the nhan cua 1 vi tri trong xau (0 , 1)
		for(int i = 0; i <=1; i++)
		{
			B[k] = i;
			Try(k+1);
		}
	}
	
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap do dai xau ");
		n = input.nextInt();
		B = new int[n];
		
		// Goi ham tao xau bat dau tai vi tri 0
		Try(0);
		input.close();
	}
}
