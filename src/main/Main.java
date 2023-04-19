package main;

import main.model.HocSinh;
import main.model.LopHoc;

public class Main {
	
	public static void main(String[] args) {
		LopHoc lopHoc = new LopHoc();
		
		try {
			lopHoc.addHocSinh(new HocSinh("HS1", "Ronaldo", 5.5f));
			lopHoc.addHocSinh(new HocSinh("HS2", "Messi", 2.5f));
			lopHoc.addHocSinh(new HocSinh("HS3", "Bale", 9.5f));
			lopHoc.addHocSinh(new HocSinh("HS4", "Henry", 5f));
			lopHoc.addHocSinh(null);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		
		lopHoc.thongTinXepLoai();
	}
}
