package annonymousinner;

public class AnnonymousRunnable {

	public static void main(String[] args) {

		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Annonymous Runnable implementation");
			}

		});
		t.start();
	}

}
