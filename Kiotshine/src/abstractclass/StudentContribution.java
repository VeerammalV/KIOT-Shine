package abstractclass;

public class StudentContribution extends Coding{

	@Override
	public void learnCoding() {
		// TODO Auto-generated method stub
		System.out.println("We should learn coding");
	}

	@Override
	public void learnLanguages() {
		// TODO Auto-generated method stub
		System.out.println("We should learn all the fundamentals of programming languages");
	}

	@Override
	public void contribute() {
		// TODO Auto-generated method stub
		System.out.println("We should contribute our knowledgee to others");
	}
	public static void main(String[] args) {
		StudentContribution v = new StudentContribution();
		v.learnCoding();
		v.learnLanguages();
		v.contribute();
		
	}
}
