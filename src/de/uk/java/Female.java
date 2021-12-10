package de.uk.java;

/*
 * Das Stichwort extends ist für die Vererbung da
 * Es kann nur von einer Klasse geerbt werden
 */
public class Female extends Human {
	/* Neue Instanzvariablen sind nur in der entsprechenden Kinderklasse aufrufbar.
	 * Die Vererbung läuft nur nach unten nicht nach oben
	 */
	private boolean pregnant;
	
	/*
	 * Konstruktor. Ist in dem Fall zwingend notwendig, da die Elternklasse auch eigene 
	 * Konstruktoren definiert hat. Hätten wir dort nichts angegeben (also den default, leeren Konstruktor gelassen)
	 * dann wäre dieser hier auch hinfällig.
	 * Wir können aber einfach Konstruktoren der Elternklasse mit dem Stichwort super aufrufen.
	 * Ähnlich zum Stichwort this (Instanz) kann man mit super generell auf die Elternklasse zugreifen
	 */
	public Female(String name, int age, int height, boolean isPregnant) {
		super(name, age, height);
		this.pregnant = pregnant;
	}
	
	/*
	 * Getter und Setter (Setter bei boolean mit is*Variablennamen*)
	 * Ermöglicht die Kontrolle darüber, welche private Variable auch von außerhalb 
	 * der Klasse veränderbar oder aufrufbar sein sollen
	 */
	public boolean isPregnant() {
		return pregnant;
	}

	public void setPregnant(boolean pregnant) {
		this.pregnant = pregnant;
	}

	/*
	 * Man kann Methoden der Elternklasse überschreiben und somit die Funktion verändern
	 */
	@Override
	public String talk() {
		return "Die Methode wurde überschrieben";
		
	}

}
