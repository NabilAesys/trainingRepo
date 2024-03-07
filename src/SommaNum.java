import java.util.Scanner;

public class SommaNum {
    public SommaNum() {
    }
    private String numeri;
    int somma = 0;
    public SommaNum(String numeri) {
        this.numeri = numeri;
    }

    public void start(){
        System.out.println("--------STRING SCANNER INPUT-------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        String numeri = scanner.nextLine();  //
        SommaNum sommaNum = new SommaNum(numeri);
        int somma = sommaNum.sommaCifre();
        System.out.println("la somma delle cifre presenti nella stringa è: " + somma);
    }
    public int sommaCifre() {
        for (int i = 0; i < numeri.length(); i++) {
            // Converte il carattere corrente in un numero intero e lo somma alla somma totale
            somma += Character.getNumericValue(numeri.charAt(i));
        }
        return somma;
    }
}
