package de.uk.java;

public class Sichtbarkeitsmodifikator {

	/* Hier die verschiedenen Sichtbarkeitsmodifikatoren
	 * … private sichtbar innerhalb der Klasse.
     * … (default) sichtbar wie private und in dem Package, in dem sich die Klasse befindet (nicht aber in Unter-/Überpackages).
     * … protected sichtbar wie (default) und in allen (erbenden) Unterklassen.
     * … public überall sichtbar.
	 */
	public int variablePublic = 1;
	private int variablePrivate = 2;
	
	public void printVariable() {
		System.out.println(variablePrivate);
		System.out.println(variablePublic);
	}
	
	private void printVariablePrivate() {
		System.out.println(variablePrivate);
		System.out.println(variablePublic);
	}
	
	protected void printVariableProtected() {
		System.out.println(variablePrivate);
		System.out.println(variablePublic);
	}
}
