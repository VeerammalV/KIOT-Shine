package inheritance;

public class Animals extends Pets{
	public void seaAnimal() {
		System.out.println("The sea animal is Dolphin");
		
	}
	public void wildAnimal() {
		System.out.println("The wild animal is Lion");
		
	}
	public void bird() {
		System.out.println("The bird is Parrot");
	}
	public static void main(String[] args) {
		Animals v = new Animals();
		v.dog();
		v.cat();
		v.cow();
		v.seaAnimal();
		v.wildAnimal();
		v.bird();
	}
	

}
