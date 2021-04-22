
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FifoTest {

	
	Fifo<Integer> f = null;
	Integer[] ai = { 1, 2, 3, 4, 5 };
	Integer[] bi = { 5, 4, 3, 2, 1 };

	@BeforeEach
	void setup() {
		f = new Fifo<>(5);
	}

	@AfterEach
	void reset() {
		f = null;

	}

	@Test
	void testPushPop() {
		for (Integer i : ai) {
			f.push(i);
			assertEquals(i, f.pop());
		}
		for (Integer i : ai) {
			f.push(i);
		}

		for (Integer i : ai) {
			assertEquals(f.pop(), i);
		}

	}

	@Test
	void testSizeCapacity() {
		int size = 0;
		int size1 = f.array.length;
		for (Integer i : ai) {
			assertEquals(size, f.size());
			assertEquals(f.capacity(), f.array.length);
			f.push(i);
			size++;
		}
		for (Integer i : ai) {
			assertEquals(f.size(), size1);
			assertEquals(f.capacity(), f.array.length);
			f.pop();
			size1--;
		}

	}

	

	@Test
	void testMoveFnF() {
		for (Integer i : ai) {
			f.push(i);
		}
		IntegerBuffer g = new Fifo(5);
		IntegerBuffer d = f;
		Helper.move(d, g);
		for (Integer i : ai) {
			assertEquals(i, g.pop()); // Test für Fifo nach Fifo
		}

	}

	@Test
	void testMoveFnL() {
		for (Integer i : ai) {
			f.push(i);
		}
		IntegerBuffer g = new Lifo(5);
		IntegerBuffer d = f;
		Helper.move(d, g);
		for (Integer i : bi) {
			assertEquals(i, g.pop()); // Test für Fifo nach Lifo
		}

	}

}
