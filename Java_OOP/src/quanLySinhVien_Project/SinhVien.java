package quanLySinhVien_Project;

import java.io.IOException;
import java.util.Scanner;

public class SinhVien implements Comparable {
	private String maSV;
	private String hoTen;
	private String gioiTinh;
	private int diemToan;
	private int diemLy;
	private int diemHoa;
	
	public SinhVien() {
		
	}
	public SinhVien(String maSV, String hoTen, String gioiTinh, int diemToan, int diemLy, int diemHoa) {
		//super();
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}
	
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public int getDiemToan() {
		return diemToan;
	}
	public void setDiemToan(int diemToan) {
		this.diemToan = diemToan;
	}
	public int getDiemHoa() {
		return diemHoa;
	}
	public void setDiemHoa(int diemHoa) {
		this.diemHoa = diemHoa;
	}
	public int getDiemLy() {
		return diemLy;
	}
	public void setDiemLy(int diemLy) {
		this.diemLy = diemLy;
	}
	
	public int getTongDiem()
	{
		return getDiemToan() + getDiemLy() + getDiemHoa();
	}
	public void inputSinhVien() throws IOException
	{
		
		/* Can bo sung them Exception-Handling */
		Scanner input = new Scanner(System.in);
		String tempStr;
		int tempInt;
		
		/* Nhap ho va ten*/
		System.out.print("Nhap ho va ten : ");
		tempStr = input.nextLine();
		setHoTen(tempStr);
		
		/*Nhap MSSV */
		System.out.print("Nhap MSSV : ");
		tempStr = input.nextLine();
		setMaSV(tempStr);
		
		/*Nhap gioi tinh */
		System.out.print("Nhap gioi tinh : ");
		tempStr = input.nextLine();
		setGioiTinh(tempStr);
		
		/* Nhap diem Toan */
		System.out.print("Nhap diem Toan : ");
		tempInt = input.nextInt();
		setDiemToan(tempInt);
		
		/* Nhap diem Ly */
		System.out.print("Nhap diem Ly : ");
		tempInt = input.nextInt();
		setDiemLy(tempInt);
		
		/* Nhap diem Hoa */
		System.out.print("Nhap diem Hoa : ");
		tempInt = input.nextInt();
		setDiemHoa(tempInt);
		
		//input.close();
		
	}
	public void displaySinhVien()
	{
		System.out.println(getMaSV() + "\t" + getHoTen() + "\t" + getGioiTinh() + "\t" 
							+ getDiemToan() + "\t" + getDiemLy() + "\t" + getDiemHoa());
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return (this.getTongDiem() < ((SinhVien) o).getTongDiem()) ? -1:(this.getTongDiem() == ((SinhVien) o).getTongDiem()) ? 0:1;
	}

	
}
