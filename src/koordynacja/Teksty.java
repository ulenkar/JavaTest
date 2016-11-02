package koordynacja;

class Teksty {
	String txt = null;
	  boolean newTxt = false;

	  // Metoda ustalaj�ca tekst - wywo�uje Autor
	  synchronized void setTextToWrite(String s) {
	    while (newTxt == true) {
	      try {
	        wait();
	      } catch(InterruptedException exc) {}
	    }
	    System.out.println("metoda set: " + s);
	    txt = s;
	    newTxt = true;
	    notifyAll();
	  }
	  
	// Metoda pobrania tekstu - wywo�uje Writer
	  synchronized String getTextToWrite() {
	    while (newTxt == false) {
	      try {
	        wait();
	        System.out.println("metoda get: " + txt);
	      } catch(InterruptedException exc) {}
	    }
	    newTxt = false;
	    notifyAll();
	    return txt;
	  }

}
