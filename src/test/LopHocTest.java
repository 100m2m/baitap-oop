package test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.exception.StudentNotExistException;
import main.model.HocSinh;
import main.model.LopHoc;

class LopHocTest {

	private LopHoc lopHoc;

	@BeforeEach
	void setUp() {
		lopHoc = new LopHoc();
	}

	@Test
	void hocSinhIsEmpty() {
		assertThrows(IllegalArgumentException.class, () -> lopHoc.addHocSinh(null));
	}
	
	@Test
	void addHocSinhSuccessfully() {
		assertDoesNotThrow(
				() -> lopHoc.addHocSinh(new HocSinh("HS", "Test", 10f)));
	}
	
	@Test
	void removeHocSinhIsEmpty() {
		lopHoc.addHocSinh(new HocSinh("HS1", "Test1", 5f));
		lopHoc.addHocSinh(new HocSinh("HS2", "Test2", 7f));
		
		assertThrows(StudentNotExistException.class, () -> lopHoc.removeHocSinh("HS3"));
		assertEquals(2, lopHoc.getDanhSachHocSinh().size());
	}
	
	@Test
	void removeHocSinhSuccessfully() {
		lopHoc.addHocSinh(new HocSinh("HS1", "Test1", 5f));
		lopHoc.addHocSinh(new HocSinh("HS2", "Test2", 7f));
		
		assertDoesNotThrow(() -> lopHoc.removeHocSinh("HS2"));
		assertEquals(1, lopHoc.getDanhSachHocSinh().size());
		assertTrue(lopHoc.getDanhSachHocSinh().get(0).getMaSo().equals("HS1"));
	}
	
	@Test
	void thongTinXepLoai() {
		lopHoc.addHocSinh(new HocSinh("HS1", "Test1", 5f));
		lopHoc.addHocSinh(new HocSinh("HS2", "Test2", 7f));
		
		assertDoesNotThrow(() -> lopHoc.thongTinXepLoai());
	}
}
