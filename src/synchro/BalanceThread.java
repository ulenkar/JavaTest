package synchro;

class BalanceThread extends Thread {

	  private Balance b;  // referencja do obiektu klasy Balance
	  private int count;  // liczba powtórzeñ pêtli w metodzie run

	  public BalanceThread(String name, Balance b, int count) {
	    super(name);
	    this.b = b;
	    this.count = count;
	    start();
	  }

	  public void run() {
	    int wynik = 0;
	    // W pêtli wielokrotnie wywo³ujemy metodê balance()
	    // na rzecz obiektu b klasy Balance.
	    // Je¿eli wynik metody jest ró¿ny od zera - przerywamy dzia³anie pêtli
	    for (int i = 0; i < count; i++) {
	      wynik = b.balance();
	      System.out.println(Thread.currentThread().getName() + ": " + wynik);
	      if (wynik != 0) break;
	    }
	    // Pokazujemy wartoœæ zmiennej wynik na wyjœciu z metody run()
	    System.out.println(Thread.currentThread().getName() +
	                       " konczy z wynikiem  " + wynik);
	  }
	}
