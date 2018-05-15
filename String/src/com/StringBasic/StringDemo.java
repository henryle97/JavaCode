package com.StringBasic;

/* - String is immutable  : vì nếu ko có thể gây hiệu ứng lên các biến tham chiều cùng 1 đối tượng  
 * 
 * 
 * */
public class StringDemo {
	public static void main(String args[])
	{
		System.out.println("--------Immutable--------");
		String str = "Le Van Hoang";
		
		str.concat(" best");		// concat() gắn thêm chuỗi vào cuối String
		System.out.println(str);	// vẫn hiện thi "Le Van Hoang" vì nó chỉ tạo thêm 1 đối tượng mới "Le Van Hoang best"
									// Trong heap giờ có 2 object "LVH" vs "LVH best"
		
		str = str.concat(" best");	//reference đến new object
		System.out.println(str);
		
		// Comparison 
		System.out.println("----------Comparison------");
		String s1 = "LVH";
		String s2 = "LVH";
		String s3 = new String("LVH");
		String s4 = "LVH2";
		
		System.out.println("Use equals()");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));		// true vì 2 đối tượng cùng biểu diễn 1 chuỗi ký tự 
		
		System.out.println("Use ==");
		System.out.println(s1 == s3); // false vì chỉ so sánh 2 đối tượng 
		System.out.println(s1 == s2);
		
		System.out.println("Use compareTot()");
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
		
	}
}
