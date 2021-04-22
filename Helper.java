
public class Helper {
	
	public static <T> void move(IntegerBuffer<T> quelle, IntegerBuffer<T> ziel) {
		if(quelle.size()>ziel.capacity()-ziel.size()) {
			throw new IndexOutOfBoundsException("Es können nicht alle Elemente ins Ziel geschoben werden, da der Buffer zu klein ist!");
		}
		while(quelle.size()>0) {
			ziel.push(quelle.pop());
		}
		
	}
}
