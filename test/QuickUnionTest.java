package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import codes.QuickUnion;

class QuickUnionTest {

	@Test
	void QuickFind() {
		QuickUnion quickUnion = new QuickUnion(10);

		assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }, quickUnion.getIDs());
	}

	@Test
	void isConnected() {
		QuickUnion quickUnion = new QuickUnion(10);

		assertEquals(false, quickUnion.isConnected(3, 5));
		assertEquals(false, quickUnion.isConnected(1, 8));

		quickUnion.union(3, 5);
		quickUnion.union(1, 8);
		quickUnion.union(8, 3);

		assertEquals(true, quickUnion.isConnected(3, 5));
		assertEquals(true, quickUnion.isConnected(1, 3));

		assertEquals(false, quickUnion.isConnected(7, 2));
		assertEquals(false, quickUnion.isConnected(4, 5));
	}

	@Test
	void root() {
		QuickUnion quickUnion = new QuickUnion(10);

		assertEquals(3, quickUnion.root(3));

		quickUnion.union(3, 5);
		quickUnion.union(5, 8);

		assertEquals(8, quickUnion.root(3));
	}
}
