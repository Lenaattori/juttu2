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
    }

}
