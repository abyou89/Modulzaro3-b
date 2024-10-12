package hu.younes.modell;

import java.util.ArrayList;
import java.util.List;

public class Ember {

    private String nev;
    private int kor;
    private List<String> nyelvTudas;

    public Ember(String nev, int kor, List<String> nyelvTudas) {
        this.nev = nev;
        this.kor = kor;
        this.nyelvTudas = new ArrayList<>(nyelvTudas);
    }


    @Override
    public String toString() {
        return "Ember{" +
                "nev='" + nev + '\'' +
                ", kor=" + kor +
                ", nyelvTudas='" + nyelvTudas + '\'' +
                '}';
    }
}
