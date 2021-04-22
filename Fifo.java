import java.util.Arrays;

public class Fifo<T> extends AbstractIntegerBuffer<T> {

	public Fifo(int i) {
		super(i);
	}

	public Fifo() {
		super();
	}

	public T pop() {
		if(size==0) {
			throw new IndexOutOfBoundsException("Es kann kein Objekt zurückgegeben werden, weil der Speicher leer ist!");
		}
		T term = array[0];
		System.out.println(term);
		for (int i = 0; i <= size - 2; i++) {
			array[i] = array[i + 1];
		}
		--size;
		return term;

	}
	public String toString() {
		return "Fifo: "+Arrays.toString(array);
	}
}
