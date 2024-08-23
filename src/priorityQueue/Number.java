package priorityQueue;

public class Number implements Comparable<Number>{

	int number;

	public Number(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public int compareTo(Number o) {
		if (number > o.getNumber())
			return 1;
		else if (number < o.getNumber())
			return -1;
		return 0;
	}
	
	
	
	
}
