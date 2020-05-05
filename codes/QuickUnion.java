package codes;

public class QuickUnion {
	private int[] id;

	QuickUnion(int N) {
		id = new int[N];

		for (int i = 0; i < id.length; i++)
			id[i] = i;
	}

	int[] getIDs() {
		return id;
	}

	public int root(int i) {
		while (i != id[i]) {
			i = id[i];
		}
		return i;
	}

	boolean isConnected(int p, int q) {
		return root(p) == root(q);
	}

	public void union(int p, int q) {
		id[root(p)] = root(q);
	}

	public static void main(String[] args) {
		QuickUnion quickUnion = new QuickUnion(10);

		System.out.println(quickUnion.isConnected(2, 5));

		quickUnion.union(2, 5);
		quickUnion.union(5, 4);
		quickUnion.union(4, 3);

		quickUnion.union(7, 8);
		quickUnion.union(8, 9);
		quickUnion.union(9, 1);

		quickUnion.union(1, 5);

		System.out.println(quickUnion.isConnected(2, 9));
		System.out.println(quickUnion.isConnected(6, 9));

		System.out.println(quickUnion.root(1));
	}
}
