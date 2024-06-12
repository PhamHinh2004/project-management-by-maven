package TestMayTinh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.PhepTinh;

class TestMayTinh {

	@Test
	void testCong() {
		assertEquals(15, PhepTinh.phepCong(10, 5));
	}
	
	@Test
	void testTru() {
		assertEquals(5, PhepTinh.phepTru(10, 5));
	}

}
