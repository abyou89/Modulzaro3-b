package hu.younes;

import hu.younes.modell.Ember;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        new Main().feladatok();
    }

    private void feladatok() throws IOException {
        InputStream is = Main.class.getClassLoader().getResourceAsStream("emberek.csv");
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String sor;
        List<Ember> emberek = new ArrayList<>();
        boolean fejlec = true;

        while ((sor = br.readLine()) != null) {
            if (fejlec) {
                fejlec = false;
                continue;
            }
            String[] adatok = sor.split(";");
            if (adatok.length >= 3) {
                String nev = adatok[0];
                int kor = Integer.parseInt(adatok[1]);


                List<String> nyelvek = new ArrayList<>();
                for (int i = 2; i < adatok.length; i++) {
                    nyelvek.add(adatok[i]);
                }

                Ember ember = new Ember(nev, kor, nyelvek);
                emberek.add(ember);
            }
        }

        for (Ember ember : emberek) {
            System.out.println(ember);
        }
    }
}





    

    
