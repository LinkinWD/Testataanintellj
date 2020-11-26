package com.LinkinWD;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        double sijoitukset = 0;
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
	        if(vastaus.equals("c")) {
                System.out.println("Paljonko haluaisit sijoittaa?");
                double sijoitus = input.nextDouble();
                if(sijoitus > tili) {
                    System.out.println("Sinulla ei ole noin paljoa rahaa tililläsi");
                    break;
                } else {
                    sijoitukset += sijoitus;
                    tili -= sijoitus;
                    System.out.println("Kiitos sijoituksestasi");
                }

            }
	        if(vastaus.equals("d")) {
                double tuotto;
                double tulos = 0;
                System.out.println("moneltako vuodelta haluaisit laskea sijoituksesi tuoton?");
                System.out.println("korko prosentti on nyt 3.1%");
                double vuodet = input.nextDouble();
                for (double i = vuodet; i >= 0 ; i--) {
                    tuotto = sijoitukset /100 *3.1;
                    tulos += tuotto;
                }
                System.out.println("Sinulla on tililläsi " + vuodet + " jälkeen: " + tulos);
            }
	        if (vastaus.equals("e")) {
                System.out.println("lopetit toiminnana");
	            break;
            }

        }

    }
}
