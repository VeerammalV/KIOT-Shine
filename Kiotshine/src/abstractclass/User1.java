package abstractclass;

public class User1 extends Facebooklogin {

	@Override
	public void Email() {
		System.out.println("The user email is abc@gmail.com");	}

	@Override
	public void Password() {
		System.out.println("The password is 12345");
	}
	public static void main(String[] args) {
		User1 v = new User1();
		v.Email();
		v.Password();
	}

}
