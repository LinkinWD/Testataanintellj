package com.LinkinWD;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        int tili = 0;
        Scanner input = new Scanner(System.in);


	    while(true) {
            System.out.println("Tervetuloa käyttämään pankkipalveluitamme.");
            System.out.println("Valitse palvelu painamalla oikeaa kirjainta");
            System.out.println("A:Tarkista saldosi");
            System.out.println("B:Tallenna rahaa tilillesi");
            System.out.println("C:Sijoita tililtäsi rahaa pankkimme rahastoon.");
            System.out.println("D:Tarkista sijoitustesi tuotto");
            System.out.println("E:Lopeta asiointi");
            String vastaus = input.nextLine().toLowerCase();

            if(vastaus.equals("a")) {
                System.out.println("tililläsi on: " + tili +"€");
                continue;
            }
	        if (vastaus.equals("b")) {
                System.out.println("Paljonko talletat?");
                int pano = input.nextInt();
                tili += pano;
                System.out.println(tili);
            }
	        if (vastaus.equals("e")) {
                System.out.println("lopetit toiminnana");
	            break;
            }

        };

    }
}
