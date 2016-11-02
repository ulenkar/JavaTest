package koordynacja;

public class KoordTest {
	public static void main(String[] args) {
	     Teksty t = new Teksty();
	     Thread t1 = new Author(t);
	     Thread t2 = new Writer(t);
	     t1.start();
	     t2.start();
	   }
}
