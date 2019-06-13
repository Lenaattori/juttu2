package juttu2;

import java.util.Scanner;

public class Juttu2 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int pituus = 0;
        while (pituus == 0) {
            System.out.println("Kuinka pitkiä listoja haluat käsitellä");
            pituus = Integer.parseInt(lukija.nextLine());

        }
        for (int luku = 1; luku <= pituus; luku++) {
            System.out.println(luku);

        }
        System.out.println("Jatketaanko laskimen käyttöä ?");
        String vastaus = lukija.nextLine();
        if (vastaus.equals("joo") || vastaus.equals("kyllä")) {
            System.out.println("Loistavaa!");
            tulostaTervehdys();
            kaynnistaHyperajo();
            moikkaa("Leo");
            tulostaNumeroita(1, pituus);
        }   

    }

    public static void tulostaTervehdys() {
        System.out.println("Arvaa mitä, olen metodin sisällä");
        System.out.println("Tule sinäkin tänne!");
    }

    public static void kaynnistaHyperajo() {
        System.out.println("Käynnistetään hyperajoa...");
        System.out.println("Valmis. Tervetuloa!");
    }

    public static void moikkaa(String nimi) {

        System.out.println("Moi " + nimi + "! ");

    }

    public static void tulostaNumeroita(int i, int x) {
        System.out.println("Osaan laske näin monella numerolla kerralla !");
        for (i = 1; i <= x; i++) {
            System.out.print(i + ", ");
        }

    }
}
