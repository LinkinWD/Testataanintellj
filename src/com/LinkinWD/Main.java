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
        String vastaus = input.next().toLowerCase();


            if(vastaus.equals("a")) {
                System.out.println("tililläsi on: " + tili +"€");

            }
	        if (vastaus.equals("b")) {
                System.out.println("Paljonko talletat?");
                int pano = input.nextInt();


                if(pano<0) {
                        System.out.println("lukusi on negatiivinen");
                        pano = 0;
                    }







                Main tulo = new Main();

                int result = tulo.laskeTalletus(tili, pano);
                tili += result;
                System.out.println("Kiitos talletuksestasi!");


            }
	        if(vastaus.equals("c")) {
                System.out.println("Paljonko haluaisit sijoittaa?");
                double sijoitus = input.nextDouble();
                if(sijoitus > tili) {
                    System.out.println("Sinulla ei ole noin paljoa rahaa tililläsi");

                } else {
                    sijoitukset += sijoitus;
                    tili -= sijoitus;
                    System.out.println("Kiitos sijoituksestasi");

                }

            }
	        if(vastaus.equals("d")) {
                double tuotto = 0;
                double tulosYhteensä = sijoitukset;
                System.out.println("moneltako vuodelta haluaisit laskea sijoituksesi tuoton?");
                System.out.println("korko prosentti on nyt 3.1%");
                int vuodet = input.nextInt();
                for ( int i = 0; i <= vuodet ; i++) {
                    tulosYhteensä = tuotto;
                    tuotto = sijoitukset * 0.031;
                    tulosYhteensä += tuotto;
                }

                System.out.println("Sinulla on tililläsi " + vuodet + " vuoden jälkeen: " + tulosYhteensä);

            }
            System.out.println("---------------------------");
	        if (vastaus.equals("e")) {
                System.out.println("lopetit toiminnana");
	            break;
            }

        }


    }
    int laskeTalletus(int a, int b) {
        int sum = a += b;
        return sum;
    }

}
