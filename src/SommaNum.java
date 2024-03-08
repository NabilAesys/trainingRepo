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
            int somma = sommaNum.sommaCifreNumeroIntero();
            System.out.println("la somma delle cifre presenti nella stringa è: " + somma);
            condition = false;
        }catch (Exception e){
            System.out.println("errore durante l'inserimento");
            System.out.println("inserisci un carattere numerico");
        }
        }while (condition);
    }

    public  int sommaCifreNumeroIntero() {
        int number = Integer.parseInt(numeri);
        while (number != 0) {
            somma += number % 10;
            number /= 10;
        }
        return somma;
    }
}
