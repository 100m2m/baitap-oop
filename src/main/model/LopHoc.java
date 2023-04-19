package main.model;

import java.util.ArrayList;
import java.util.List;

import main.exception.StudentNotExistException;

public class LopHoc {

	private List<HocSinh> danhSachHocSinh;
	
	public LopHoc() {
		this.danhSachHocSinh = new ArrayList<>();
	}
	
	public List<HocSinh> getDanhSachHocSinh() {
		return this.danhSachHocSinh;
	}
	
	public void addHocSinh(HocSinh hocSinh) {
		if (hocSinh == null) {
			throw new IllegalArgumentException("Hoc sinh khong duoc phep NULL");
		}
		
		this.danhSachHocSinh.add(hocSinh);
	}
	
	public void removeHocSinh(String maSo) {
		for (int i = 0; i < this.danhSachHocSinh.size(); i++) {
			HocSinh hocSinh = this.danhSachHocSinh.get(i);
			
			if (hocSinh.getMaSo().equals(maSo)) {
				this.danhSachHocSinh.remove(i);
				return;
			}
		}
		
		throw new StudentNotExistException("Hoc sinh khong ton tai");
	}
	
	public void thongTinXepLoai() {
		System.out.println("Thong tin xep loai:");
		for (HocSinh hocSinh : this.danhSachHocSinh) {
			System.out.println(hocSinh.toString());
			hocSinh.xepLoai();
		}
	}
}
