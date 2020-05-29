package beans;

public class Test {

	private static Test t;

	private Test() {
		System.out.println("Private Object");
	}

	public static Test getInstance() {
		// to ensure singleton object
		if (t == null) {
			t = new Test();
			return t;
		} else {
			return t;

		}
	}
	// use to avoid cloning of the object
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

}
