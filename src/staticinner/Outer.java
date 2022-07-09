package staticinner;

public class Outer {
	static void f1() {
		System.out.println("Inside outer");
	}

	static class Inner {
		static void f2() {
			System.out.println("Inside Inner");
		}

		void f3() {
			System.out.println("Non static method inside Inner");
		}
	}

	public static void main(String[] args) {
		Outer.Inner inner = new Outer.Inner();
		Outer.f1();
		Outer.Inner.f2();
		inner.f3();

	}

}
