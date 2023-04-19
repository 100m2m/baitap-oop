package main.model;

import main.util.StringUtils;

public class HocSinh {

	private String maSo;
	private String hoTen;
	private float diemTB;
	
	public HocSinh(String maSo, String hoTen, float diemTB) {
		if (StringUtils.isEmpty(maSo)) {
			throw new IllegalArgumentException("Ma so khong hop le");
		}
		
		if (StringUtils.isEmpty(hoTen)) {
			throw new IllegalArgumentException("Ho ten khong hop le");
		}
		
		this.maSo = maSo;
		this.hoTen = hoTen;
		
		validateDiemTB(diemTB);
		this.diemTB = diemTB;
	}
	
	public String getMaSo() {
		return this.maSo;
	}
	
	public void xepLoai() {
		validateDiemTB(this.diemTB);
		
		System.out.print("\tKet qua xep loai: ");
		if (this.diemTB < 3) {
			System.out.println("YEU");
		} else if (this.diemTB < 5) {
			System.out.println("TRUNG BINH");
		} else if (this.diemTB < 8) {
			System.out.println("KHA");
		} else if (this.diemTB < 10) {
			System.out.println("GIOI");
		} else {
			System.out.println("XUAT SAC");
		}
	}
	
	private void validateDiemTB(float diemTB) {
		if (diemTB < 0 || diemTB > 10) {
			throw new IllegalArgumentException("Diem TB nam ngoai pham vi 0-10");
		}
	}
	
	@Override
	public String toString() {
		return "Ma so: " + this.maSo + " | Ho ten: " + this.hoTen + " | Diem TB: " + this.diemTB;
	}
}
