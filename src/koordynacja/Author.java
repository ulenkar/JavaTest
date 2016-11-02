package koordynacja;

public class Author extends Thread {

	  Teksty txtArea;

	  Author(Teksty t)  {
	    txtArea=t;
	  }

	  public void run() {

	    String[] s = { "Pies", "Kot", "Zebra", "Lew", "Owca", "S³oñ", "Mysz", "Papuga", null };
	    for (int i=0; i<s.length; i++) {
	      try { // autor zastanawia siÃª chwilÃª co napisaÃ¦
	        sleep((int)(Math.random() * 1000));
	      } catch(InterruptedException exc) { }
	      txtArea.setTextToWrite(s[i]);
	    }
	  }

	}
