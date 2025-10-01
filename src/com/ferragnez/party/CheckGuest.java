package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
//         Nel programma occorre:
// - creare e inizializzare l’array contenente i nomi degli invitati
// - chiedere all’utente come si chiama
// - verificare che il nome sia presente nella lista
// - lasciarlo entrare o rispedirlo cortesemente da dove è venuto :occhiali_da_sole: 

// Bonus
// se avete usato il ciclo for per cercare il nome nella lista nella consegna base, implementare lo stesso programma usando il ciclo while, e viceversa

// Lista invitati: 
// Dua Lipa, Paris Hilton, Manuel Agnelli, J-Ax, Francesco Totti, Ilary Blasi, Bebe Vio, Luis, Pardis Zarei, Martina Maccherone, Rachel Zeilic

        // ? Inizializzo l'array di invitati
        String[] guests = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        //Prendo in input in nome dell'utente
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome e il tuo cognome");
        String userName = input.nextLine().replaceAll("\\s+", "").toLowerCase();

        //Creo una variabile booleana per il controllo della presenza dello username
        boolean isPresent = false;


        //? Logica con il FOR
        // //Per ogni elemento dell'array
        // for (int i = 0; i < guests.length; i++) {

        //     String guest = guests[i].replaceAll("\\s+", "").toLowerCase();
        //     // System.out.println(guest);
            
        //     if (guest.equals(userName)) {
        //         isPresent = true;
        //     } 
        // }

        //? Logica con il WHILE
        int i = 0;
        while (!isPresent && i < guests.length) {
            String guest = guests[i].replaceAll("\\s+", "").toLowerCase();
            if (guest.equals(userName)) {
                isPresent = true;
            } 

            i++;
        }
        

        if (isPresent) {
            
            System.out.println("Ciao " + guests[i-1] + ", sei stato invitat*!");
        } else {
                System.out.println("Mi dispiace ma non sei invitato!");

        }

        input.close();
    }
}
