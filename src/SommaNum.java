public class SommaNum {

    private String numeri;

    public SommaNum(String numeri) {
        this.numeri = numeri;
    }

    public int sommaCifre() {
        int somma = 0;

        // Itera attraverso i caratteri della stringa
        for (int i = 0; i < numeri.length(); i++) {
            // Converte il carattere corrente in un numero intero e lo somma alla somma totale
            somma += Character.getNumericValue(numeri.charAt(i));
        }
        return somma;
    }
}
