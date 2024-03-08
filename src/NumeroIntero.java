import java.util.Scanner;

public class NumeroIntero {
    private  int num;
    int somma = 0;
    boolean condition = true;

    public NumeroIntero(int num) {
        this.num = num;
    }
    public NumeroIntero() {
    }

    public void start(){
        do {


        try {
            System.out.println("--------INTEGER SCANNER INPUT-------");
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Inserisci un numero");
            int inputUtente1 = scanner1.nextInt();
            NumeroIntero numeroIntero = new NumeroIntero(inputUtente1);
            int i = numeroIntero.sommaCifreNumeroIntero();
            System.out.println("la somma delle cifre presenti nel numero intero è: " + i);
            condition=false;
        }catch (Exception e){
            System.out.println("errore durante l'inserimento");
        }
        }while (condition);
    }

    public  int sommaCifreNumeroIntero() {
        while (num != 0) {
            somma += num % 10;
            num /= 10;
        }
        return somma;
    }
}
