package synchro;

class BalanceTest {

	  public static void main(String[] args) {

	    int tnum = Integer.parseInt(args[0]);     // liczba w¹tków
	    int count = Integer.parseInt(args[1]);    // liczba powtórzeñ pêtli w run()

	    // Tworzymy obiekt klasy balance
	    Balance b = new Balance();

	    // Tworzymy i uruchamiamy w¹tki
	    Thread[] thread = new Thread[tnum];  // tablica w¹tków
	    for (int i = 0; i < tnum; i++)
	      thread[i] = new BalanceThread("W"+(i+1), b, count);

	    // czekaj na zakoñczenie wszystkich w¹tków
	    try {
	      for (int i = 0; i < tnum; i++) thread[i].join();
	    } catch (InterruptedException exc) {
	      System.exit(1);
	    }
	    System.out.println("Koniec programu");
	  }

	}
