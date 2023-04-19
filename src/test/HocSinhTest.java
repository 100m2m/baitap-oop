package test;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.model.HocSinh;

class HocSinhTest {

	@Test
	void maSoIsEmpty() {
		try {
			new HocSinh("", "Test", 9f);
			fail();
		} catch (IllegalArgumentException ex) {
			assertEquals("Ma so khong hop le", ex.getMessage());
		}
	}

	@Test
	void maSoIsBlank() {
		try {
			new HocSinh("  ", "Test", 9f);
			fail();
		} catch (IllegalArgumentException ex) {
			assertEquals("Ma so khong hop le", ex.getMessage());
		}
	}

	@Test
	void maSoIsNull() {
		try {
			new HocSinh(null, "Test", 9f);
			fail();
		} catch (IllegalArgumentException ex) {
			assertEquals("Ma so khong hop le", ex.getMessage());
		}
	}

	@Test
	void hoTenIsEmpty() {
		try {
			new HocSinh("HS1", "", 9f);
			fail();
		} catch (IllegalArgumentException ex) {
			assertEquals("Ho ten khong hop le", ex.getMessage());
		}
	}

	@Test
	void hoTenIsBlank() {
		try {
			new HocSinh("HS1", "  ", 9f);
			fail();
		} catch (IllegalArgumentException ex) {
			assertEquals("Ho ten khong hop le", ex.getMessage());
		}
	}

	@Test
	void hoTenIsNull() {
		try {
			new HocSinh("HS1", null, 9f);
			fail();
		} catch (IllegalArgumentException ex) {
			assertEquals("Ho ten khong hop le", ex.getMessage());
		}
	}
	
	@Test
	void diemTBGreaterThan10() {
		try {
			new HocSinh("HS1", "Test", 10.1f);
			fail();
		} catch (IllegalArgumentException ex) {
			assertEquals("Diem TB nam ngoai pham vi 0-10", ex.getMessage());
		}
	}
	
	@Test
	void diemTBLessThan0() {
		try {
			new HocSinh("HS1", "Test", -0.1f);
			fail();
		} catch (IllegalArgumentException ex) {
			assertEquals("Diem TB nam ngoai pham vi 0-10", ex.getMessage());
		}
	}
	
	@Test
	void xepLoaiSuccessfully() {
		HocSinh hocSinh = new HocSinh("HS1", "Test", 10f);
		
		assertDoesNotThrow(() -> hocSinh.xepLoai());
	}
	
	@Test
	void newHocSinhSuccessfully() {
		assertDoesNotThrow(() -> new HocSinh("HS1", "Test", 10f));
	}
	
	@Test
	void toStringSuccessfully() {
		HocSinh hocSinh = new HocSinh("HS1", "Test", 10f);
		String expectedString = "Ma so: HS1 | Ho ten: Test | Diem TB: 10.0";
		assertEquals(expectedString, hocSinh.toString());
	}
}
