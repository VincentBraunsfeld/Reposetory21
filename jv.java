
public class Task implements TaskIF {
	private String[][] zweiD;
	//was ist das denn für nh scheiße?
	public Task(String[][] s) {
		zweiD=s;
	}
	public boolean isWellSorted(String[] sequenz) {
		String kommtJederStringNurEinmalVor="";
		for(int i=0;i<sequenz.length;i++) {
			if(kommtJederStringNurEinmalVor.contains(sequenz[i])) {
				return false;
			}
			if
			
		}
		return false;
		
		
	}
}

