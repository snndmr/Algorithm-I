package codes;

public class QuickFind {
	private int[] id;

	public QuickFind(int n) {
		id = new int[n];

		for (int i = 0; i < id.length; i++) {
			id[i] = i;
		}
	}

	boolean isConnected(int p, int q) {
		return id[p] == id[q];
	}

	public void union(int p, int q) {
		int pid = id[p];
		int qid = id[q];

		for (int i = 0; i < id.length; i++) {
			if (id[i] == pid) {
				id[i] =  qid;
			}
		}
	}

	public static void main(String[] args) {
		QuickFind quickFind = new QuickFind(10);

		System.out.println(quickFind.isConnected(1, 3));

		quickFind.union(1, 3);
		quickFind.union(3, 5);

		System.out.println(quickFind.isConnected(1, 5));
	}
}
