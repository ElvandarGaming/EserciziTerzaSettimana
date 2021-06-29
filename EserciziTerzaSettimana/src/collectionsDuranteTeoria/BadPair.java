package collectionsDuranteTeoria;

public class BadPair {
// lavora sempre con object, non si puo specificare il tipo di first e second
	private Object first;
	private Object second;
	
	public BadPair(Object first, Object second) {
		this.first=first;
		this.second=second;
	}

	public Object getFirst() {
		return first;
	}
	public Object getSecond() {
		return second;
	}
}
