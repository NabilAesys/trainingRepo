

public class SommaCifreNumero {
    public static int sommaCifre(int numero) {
        int somma = 0;

        // Finché il numero non diventa 0, prendo l'ultima cifra, la sommo alla somma totale e divido il numero per 10
        while (numero != 0) {
            somma += numero % 10;
            numero /= 10;
            System.out.println(somma);
        }

        return somma;
    }

    public static void main(String[] args) {
        int numero = 12345;
        int risultato = sommaCifre(numero);
        System.out.println("La somma delle cifre di " + numero + " è: " + risultato);
    }
}

