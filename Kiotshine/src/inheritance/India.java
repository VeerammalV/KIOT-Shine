package inheritance;

public class India extends Tamilnadu{
	public void nationalAnimal() {
		System.out.println("Tiger");
	}
	public void bird() {
		System.out.println("Peacock");
	}
	public void flower() {
		System.out.println("lotus");
	}
	public static void main(String[] args) {
		India v = new India();
		v.nationalAnimal();
		v.bird();
		v.flower();
		v.capital();
		v.district();
		v.dam();
		v.beach();
		v.falls();
		v.place();
	}
}
