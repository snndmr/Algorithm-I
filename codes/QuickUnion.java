package codes;

public class QuickUnion {
	private int[] id;

	public QuickUnion(int N) {
		id = new int[N];

		for (int i = 0; i < id.length; i++)
			id[i] = i;
	}

	public int[] getIDs() {
		return id;
	}

	public int root(int i) {
		while (i != id[i]) {
			i = id[i];
		}
		return i;
	}

	public boolean isConnected(int p, int q) {
		return root(p) == root(q);
	}

	public void union(int p, int q) {
		id[root(p)] = root(q);
	}
}
