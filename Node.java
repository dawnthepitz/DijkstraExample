class Node {
	int x, y;
	int origin;
	double total;
	boolean visited;
	SQL ArcSet;

	Node(int index) {
		origin = index;
		total = Double.MAX_VALUE;
		visited = false;
		ArcSet = new SQL();
	}
	void Refresh(int index) {
		origin = index;
		total = Double.MAX_VALUE;
		visited = false;
	}
	void SetXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
