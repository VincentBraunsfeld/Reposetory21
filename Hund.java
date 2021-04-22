
public class Hund {
	private int age;
	private String name="";
	
	public Hund() {
		age=0;
		name="Chep";
	}
	public Hund(int a,String b) {
		age=a;
		name=b;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return "Hundename: "+getName()+" Alter: "+getAge();
	}
}
