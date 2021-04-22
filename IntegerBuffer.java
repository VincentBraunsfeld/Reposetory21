
public interface IntegerBuffer<T> {
	void push(T i);
	T pop();
	int size();
	int capacity();
}
