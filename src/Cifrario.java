import java.util.Scanner;

public class Cifrario {
    public void start() {
        System.out.println("******************************");
        System.out.println("------------------------------");
        System.out.println("--------CIFRA & DECIFRA-------");
        System.out.println("------------------------------");
        System.out.println("******************************");

        Scanner scanner = new Scanner(System.in);

        // Input del testo e del numero di spostamenti
        System.out.print("Inserisci il testo: ");
        String testo = scanner.nextLine();
        System.out.print("Inserisci il fattore di cifratura: ");
        int spostamenti = scanner.nextInt();

        // Scelta tra cifrare o decifrare
        System.out.println("Vuoi cifrare (C) o decifrare (D)?");
        char scelta = scanner.next().toUpperCase().charAt(0);

        String risultato = "";
        if (scelta == 'C') {
            risultato = cifra(testo, spostamenti);
        } else if (scelta == 'D') {
            risultato = decifra(testo, spostamenti);
        } else {
            System.out.println("Scelta non valida.");
            return;
        }

        System.out.println("Risultato: " + risultato);
    }

    public static String cifra(String testo, int spostamenti) {
        return trasforma(testo, spostamenti);
    }

    public static String decifra(String testo, int spostamenti) {
        return trasforma(testo, -spostamenti);
    }

    private static String trasforma(String testo, int spostamenti) {
        StringBuilder risultato = new StringBuilder();

            // Itera attraverso ogni carattere nel testo
        for (int i = 0; i < testo.length(); i++) {
            char carattere = testo.charAt(i);

            // Controllo se il carattere è una lettera dell'alfabeto
            if (Character.isLetter(carattere)) {
                // Calcola la nuova posizione del carattere dopo lo spostamento
                char nuovoCarattere = (char) ('A' + (Character.toUpperCase(carattere) - 'A' + spostamenti) % 26);

                // aggiungo il carattere cifrato al risultato
                risultato.append(Character.isLowerCase(testo.charAt(i)) ? Character.toLowerCase(nuovoCarattere) : nuovoCarattere);
            } else {
                // Se non è una lettera, aggiungo il carattere senza modificarlo
                risultato.append(carattere);
            }
        }

        return risultato.toString();
    }
}
