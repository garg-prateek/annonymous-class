package nonstaticinner;

public class Outer {
	private static int x = 50;
	private int y;

	Outer(int y) {
		this.y = y;
	}

	void f1() {
		System.out.println("Outer classes non static methods");
	}

	class Inner {
		private int y;

		Inner(int y) {
			this.y = y;
		}

		void f2() {
			// System.out.println("Inner classes non static methods");
			System.out.println("Outer class X: " + Outer.x);
			System.out.println("Outer class Y: " + Outer.this.y);
			System.out.println("Inner class Y: " + this.y);
		}
	}

	public static void main(String[] args) {
		Outer outer = new Outer(80);
		outer.f1();
		Outer.Inner inner = outer.new Inner(90);
		inner.f2();
		// Outer.Inner.f2();

	}

}
