package partitionProblem_Greedy;


/*
 * Don't finish !!!
 */
import java.util.Scanner;
import java.util.Vector;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class PartitionProplem {
	
	static Vector<Integer> set1;
	static Vector<Integer> set2;
	
	public static Boolean partition(Integer arr[], int size)
	{
		set1 = new Vector<Integer>(size);
		set2 = new Vector<Integer>(size);
		int sum1 = 0, sum2 = 0;
		set1.addElement(arr[0]);
		sum1 += arr[0];
		for (int i = 1; i < size; i++)
		{
			if (sum2 < sum1)
			{
				set2.addElement(arr[i]);
				sum2 += arr[i];
			}
			else {
				set1.addElement(arr[i]);
				sum1 += arr[i];
			}				
		}
		if (sum1 == sum2)
			return true;
		else
			return false;
	}
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Nhap so phan tu: ");
		int n = keyboard.nextInt();
		
		Integer arr[] = new Integer[n];
		for (int i = 0; i < n; i++)
		{
			arr[i] = keyboard.nextInt();
		}
		
		// Sap xep mang theo thu tu giam dan
		Arrays.sort(arr, Collections.reverseOrder());
		
		if (partition(arr, n) == true) 
		{
			System.out.print("Set 1: ");
			for (int i = 0; i < set1.size(); i++)
				System.out.print(set1.elementAt(i) + " ");
			System.out.print("Set 2: ");
			for (int i = 0; i < set2.size(); i++)
				System.out.print(set2.elementAt(i) + " ");
		}
		else
			System.out.println("Can't partition.");
	
		
	}
}
