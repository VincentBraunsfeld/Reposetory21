
public abstract class AbstractIntegerBuffer<T> implements IntegerBuffer<T> {

	protected T[] array;
	protected int size;

	@SuppressWarnings("unchecked")
	public AbstractIntegerBuffer(int length) {
		if (length < 0) {
			throw new IllegalArgumentException("Zahl muss größer als Null sein");
		}
		array = (T[]) new Object[length];
	}

	@SuppressWarnings("unchecked")
	public AbstractIntegerBuffer() {
		int x = 3 + (int) (Math.random() * ((100 - 3) + 1));
		array = (T[]) new Object[x];
	}

	public void push(T i) {
		if (size == array.length) {
			throw new IndexOutOfBoundsException("Der Buffer ist bereits voll");
		}

		array[size++] = i;

	}

	public int size() {
		return size;
	}

	public int capacity() {
		return array.length;
	}

}
