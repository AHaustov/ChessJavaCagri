package Spiel;

import java.util.Map;
import java.util.TreeMap;

public class Spiel {
    Feld[][] spielFeld = new Feld[8][8];
    Map<String, Feld> spielMap = new TreeMap<>();

    public Spiel() {
        String key;
        char spalte;
        char zeile;
        for (int nr = 0; nr < 64; nr++) {
            spalte = (char) ('a' + nr % 8);
            zeile = (char) ('1' + nr / 8);
            key = spalte + "" + zeile;
            spielMap.put(key, new Feld(key));
        }
    }

//    public Spiel() {
//
//        for (int z = 0; z < 8; z++) {
//            for (int s = 0; s < 8; s++) {
//                spielFeld[z][s] = new Feld();
//
//            }
//        }
//    }
    public void anzeigen() {
        for (Feld[] zeile : spielFeld) {
            for (Feld feld : zeile) {
                System.out.print(feld.getFeldFarbe());
            }
            System.out.println();
        }
    }

    public void mapAnzeigen() {
        for (int zeile = 7; zeile >= 0; zeile--) {
            for (int spalte = 0; spalte < 8; spalte++) {
                String key = (char) ('a' + spalte) + "" + (char) ('1' + zeile);
                Feld feld = spielMap.get(key);
                System.out.print(key);
                System.out.print(feld.getFeldFarbe());
            }
            System.out.println();
        }
    }
}
