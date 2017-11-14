package generics;

public class Pair<T> {
	
	private T right;
	private T left;
	
	public Pair(T left, T right) {
		super();
		this.right = right;
		this.left = left;
	}

	public T getRight() {
		return right;
	}
	
	public Pair<T> swap() {
		return new Pair<T>(right, left);
		
	}
	
	//if static , have to mention the <T> in signature
	public static <T> void swap(Pair<T> pair) {
		T temp = pair.left;
		pair.left = pair.right;
		pair.right = temp;
	}

	public T getLeft() {
		return left;
	}

	@Override
	public String toString() {
		return "ModifiedPair [right=" + right + ", left=" + left + "]";
	}
	
	
	

}
