package codes;

public class QuickFind {
	private int[] id;

	QuickFind(int N) {
		id = new int[N];

		for (int i = 0; i < id.length; i++)
			id[i] = i;
	}

	int[] getIDs() {
		return id;
	}

	boolean isConnected(int p, int q) {
		return id[p] == id[q];
	}

	void union(int p, int q) {
		int pid = id[p];
		int qid = id[q];

		for (int i = 0; i < id.length; i++) {
			if (id[i] == pid) {
				id[i] = qid;
			}
		}
	}
}
