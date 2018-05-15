package quanLySinhVien_Project;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class SinhVienTest {
	public static final int max = 100;
	static SinhVien[] SVList = new SinhVien[max];		// Tao mot mang cac doi tuong SinhVien
	static int numSV = 0;				//So luong sinh vien hien tai
	
	/* Them SV */
	public static void addSV() throws Exception
	{
		SVList[numSV] = new SinhVien();		//Tao mot doi tuong SinhVien
		
		/* Nhap thong tin SV */
		SVList[numSV].inputSinhVien();
		numSV++;
	}
	
	/* Xem danh sach SV */
	public static void displaySVList()
	{
		if (numSV == 0)
		{
			System.out.println("Chua co sinh vien nao, hay them mot sinh vien moi!");
			return;
		}
		for (int i = 0; i < numSV; i++)
		{
			SVList[i].displaySinhVien();
		}
	}
	
	public static void arangeSV()
	{	
		// Sap xep noi bot  O(n^2)
		for (int i = 0; i < numSV-1; i++)
			for(int j = i+1; j < numSV; j++)
			{
				if (SVList[i].getTongDiem() > SVList[j].getTongDiem())
				{
					SinhVien temp = new SinhVien();
					temp = SVList[i];
					SVList[i] = SVList[j];
					SVList[j] = temp;
				}
			}
		
		// Quick Sort
	}
	
	/* Kiem tra da sap xep theo tongdiem */
	static boolean checkOrder()
	{
		for (int i = 0; i < numSV-1; i++)
			for(int j = i+1; j < numSV; j++)
			{
				if (SVList[i].getTongDiem() > SVList[j].getTongDiem())
				{
					return false;
				}
			}
	
		return true;
	}
	
	static void editName()
	{
		Scanner in = new Scanner(System.in);
		do {
			System.out.print("Nhap MSSV can sua ten: ");
			String studentID = in.nextLine();
			
			// Tim kiem sinh vien co ma nay
			// C1: Tim kiem tuan tu 
			int pos  = -1; //Vi tri cua SV
			
			for (int i = 0; i < numSV; i++)
			{
				if (SVList[i].getMaSV().equals(studentID))		// So sanh 2 string
				{	
					pos = i;
					break;
				}
			}
			if (pos == -1)
				continue;
			System.out.println("Tim thay SV co ma " + studentID + ": " + SVList[pos].getHoTen());
			System.out.print("Nhap ten thay the: ");
			String studenName = in.nextLine();
			SVList[pos].setHoTen(studenName);
			System.out.println("Chinh sua thanh cong");
			return;
			
	} while(true);
		
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int choose = -1;
		/* MENU */
		System.out.println("\t\t\tMENU\t\t\t");
		System.out.println("1. Thêm một sinh viên mới.");
		System.out.println("2. Xem danh sách sinh viên.");
		System.out.println("3. Sắp xếp danh sách theo thứ tự tăng dần theo tongdiem ");
		System.out.println("4. Kiểm tra xem danh sách đã sắp xếp theo tongdiem hay chưa.");
		System.out.println("5. Tìm kiếm tuyến tính theo tongdiem.");
		System.out.println("6. Sửa tên sinh viên có mã được nhập từ bàn phím.");
		System.out.println("7. Xóa sinh viên có masv = xMasv (nhập từ bàn phím).");
		System.out.println("8. Chèn một sinh viên vào danh sách đã sắp xếp sao tính sắp xếp vẫn được bảo tồn. ");
		System.out.println("0. Kết thúc.");
		try {
		do {
			System.out.print("Mời bạn chọn : ");
			choose = in.nextInt();
			
			switch(choose) {
			case 1:	addSV();
					break;
			case 2:	displaySVList();
					break;
			case 3:	arangeSV();
					displaySVList();
					break;
			case 4:
			case 5:
			case 6:	editName();
					break;
			case 7:
			case 8:
			case 0:
			default: break;
			}
		} while (choose != 0);		// Tai sao dung while {} ko lại NoSuchElementException 
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
