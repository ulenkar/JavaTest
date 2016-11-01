package synchro;

class BalanceThread extends Thread {

	  private Balance b;  // referencja do obiektu klasy Balance
	  private int count;  // liczba powt�rze� p�tli w metodzie run

	  public BalanceThread(String name, Balance b, int count) {
	    super(name);
	    this.b = b;
	    this.count = count;
	    start();
	  }

	  public void run() {
	    int wynik = 0;
	    // W p�tli wielokrotnie wywo�ujemy metod� balance()
	    // na rzecz obiektu b klasy Balance.
	    // Je�eli wynik metody jest r�ny od zera - przerywamy dzia�anie p�tli
	    for (int i = 0; i < count; i++) {
	      wynik = b.balance();
	      System.out.println(Thread.currentThread().getName() + ": " + wynik);
	      if (wynik != 0) break;
	    }
	    // Pokazujemy warto�� zmiennej wynik na wyj�ciu z metody run()
	    System.out.println(Thread.currentThread().getName() +
	                       " konczy z wynikiem  " + wynik);
	  }
	}
