package synchro;

class BalanceTest {

	  public static void main(String[] args) {

	    int tnum = Integer.parseInt(args[0]);     // liczba w�tk�w
	    int count = Integer.parseInt(args[1]);    // liczba powt�rze� p�tli w run()

	    // Tworzymy obiekt klasy balance
	    Balance b = new Balance();

	    // Tworzymy i uruchamiamy w�tki
	    Thread[] thread = new Thread[tnum];  // tablica w�tk�w
	    for (int i = 0; i < tnum; i++)
	      thread[i] = new BalanceThread("W"+(i+1), b, count);

	    // czekaj na zako�czenie wszystkich w�tk�w
	    try {
	      for (int i = 0; i < tnum; i++) thread[i].join();
	    } catch (InterruptedException exc) {
	      System.exit(1);
	    }
	    System.out.println("Koniec programu");
	  }

	}
