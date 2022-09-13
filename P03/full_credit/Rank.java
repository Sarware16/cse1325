public class Rank {
	private int rank;
	public static final int MIN = 0;
	public static final int MAX = 9;

	public Rank(int rank) {
		if(MIN > rank || rank > MAX) throw new IllegalArgumentException("Rank must be between 0 and 9");
		
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "" + rank;
	}
}