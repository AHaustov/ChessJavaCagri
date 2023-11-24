package Spiel;

import Figur.Figur;

public class Feld {
    private char feldFarbe;
    private Figur figur;
    private int feldNr;
    private static int laufendeNr;
    private int zeile;
    private int spalte;

    public Feld() {
        feldNr = laufendeNr++;
        zeile = feldNr / 8;
        spalte = feldNr % 8;
        feldFarbe = (zeile + spalte) % 2 == 0 ? '\u2593' : '\u2591';
        //System.out.println(feldNr + " " + zeile + "," + spalte + ", " + feldFarbe + " " + (zeile + spalte % 2 == 0));
    }

    public Feld(String koordinaten) { // a1 dunkel a2 hell a3 dunkel
        feldNr = laufendeNr++;
        zeile = koordinaten.charAt(1) - '0';
        spalte = koordinaten.charAt(0) - 'a';
        feldFarbe = (zeile + spalte) % 2 == 0 ? '\u2593' : '\u2591';
    }

    public char getFeldFarbe() {
        return feldFarbe;
    }
}
