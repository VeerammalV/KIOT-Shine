package inheritance;

public class Transportation extends Roadways {
	public static void main(String[] args) {
		Transportation v = new Transportation();
		v.twoWheeler();
		v.fourWheeler();
		v.train();
		v.boat();
		v.ship();
		v.airPlane();
		v.helicopter();
		v.jet();
	}
}

