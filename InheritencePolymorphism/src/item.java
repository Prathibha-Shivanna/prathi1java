
abstract class item<Item> {

	private int idNum;
	private String title;
	private int numCopies;

	public item() {
		idNum = 0;
		title = "";
		numCopies = 0;
	}

	public item(int idNum, String title, int numCopies) {
		this.idNum = idNum;
		this.title = title;
		this.numCopies = numCopies;
	}

	public int setidNum(int id) {
		idNum = id;
		return id;
	}

	public String setTitle(String str) {
		title = str;
		return str;
	}

	public int setNumCopies(int n) {
		numCopies = n;
		return n;
	}

	public int getidNum() {
		return idNum;
	}

	public String getTitle() {
		return title;
	}

	public int getCopies() {
		return numCopies;
	}

	public void checkIn() {
		numCopies = numCopies + 1;
	}

	public void checkOut() {
		numCopies = numCopies - 1;
	}

	public void addItem(int idNum, String str, int n) {
		setidNum(idNum);
		setTitle(str);
		setNumCopies(n);
	}

	public String toString() {
		return "ID: " + idNum + " Title: " + title + " Number of Copies: " + numCopies;
	}

	public void print() {
		System.out.println("Title: " + title);
		System.out.println("ID: " + idNum);
		System.out.println("Number of copies: " + numCopies);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idNum;
		result = prime * result + numCopies;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		item other = (item) obj;
		if (idNum != other.idNum)
			return false;
		if (numCopies != other.numCopies)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	public void addItem() {
		numCopies++;
	}
}
