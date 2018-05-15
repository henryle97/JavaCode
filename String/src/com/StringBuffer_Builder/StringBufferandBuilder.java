package com.StringBuffer_Builder;

/* StringBuffer and StringBuilder dành cho mục đích sử dụng chuỗi có khả năng thay đổi được (Mutable)
 * 
 * - Điểm khác nhau: StringBuffer cho  đa luồng (Multilthreading ) >< StringBuilder cho đơn luồng 
 * - Tốc độ : Builder > Buffer > String
 */
public class StringBufferandBuilder {
	public static void main(String args[])
	{
		StringBuffer str = new StringBuffer("append()");
		
		str.append(" is used to append the specified string with this string.");
		System.out.println(str);
		
		StringBuilder str2 = new StringBuilder("Hello World");
		str2.insert(5, " Java");
		System.out.println(str2);
		
		StringBuilder str3 = new StringBuilder("Hello World"); // replace "Hi World"
		str3.replace(1, 5 , "i");		// start -> end-1
		System.out.println(str3);
		System.out.println(str3.capacity());
		
		
	}
}
