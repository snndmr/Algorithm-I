package codes;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class QuickFindTest {

	@Test
	void QuickFind() {
		QuickFind quickFind = new QuickFind(10);

		assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }, quickFind.getIDs());
	}

	@Test
	void isConnected() {
		QuickFind quickFind = new QuickFind(10);

		assertEquals(false, quickFind.isConnected(3, 5));
		assertEquals(false, quickFind.isConnected(1, 8));

		quickFind.union(3, 5);
		quickFind.union(1, 8);
		quickFind.union(8, 3);

		assertEquals(true, quickFind.isConnected(3, 5));
		assertEquals(true, quickFind.isConnected(1, 3));
		
		assertEquals(false, quickFind.isConnected(7, 2));
		assertEquals(false, quickFind.isConnected(4, 5));
	}

}
