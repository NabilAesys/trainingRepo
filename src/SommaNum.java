import java.util.Scanner;

public class SommaNum {
    public SommaNum() {
    }
    private String numeri;

    boolean condition = true;
    int somma = 0;
    public SommaNum(String numeri) {
        this.numeri = numeri;
    }

    public void start(){
        do {

        try {
            System.out.println("--------STRING SCANNER INPUT-------");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Inserisci un numero");
            String numeri = scanner.nextLine();
            SommaNum sommaNum = new SommaNum(numeri);
            int somma = sommaNum.sommaCifre();
            System.out.println("la somma delle cifre presenti nella stringa è: " + somma);
            condition = false;
        }catch (Exception e){
            System.out.println("errore durante l'inserimento");
        }
        }while (condition);
    }
    public int sommaCifre() {
        for (int i = 0; i < numeri.length(); i++) {
            somma += Character.getNumericValue(numeri.charAt(i));
        }
        return somma;
    }
}
