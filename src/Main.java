
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        boolean cnd = true;
        boolean condition = false;

        do {

            do {
                try {

                    System.out.println("****************************************");
                    System.out.println("****************************************");
                    System.out.println("SCEGLI OPERAZIONE CHE VUOI ESEGUIRE");
                    System.out.println("****************************************");
                    System.out.println("DIGITA 1 PER INSERIRE UN NUMERO INTERO");
                    System.out.println("--------------------------------------");
                    System.out.println("DIGITA 2 PER INSERIRE UN INSIEME DI CIFRE");
                    System.out.println("--------------------------------------");
                    System.out.println("DIGITA 3 PER GIOCARE A INDOVINA NUMERO");
                    System.out.println("--------------------------------------");
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Inserisci il numero che equivale alla tua scelta");
                    Integer sceltaUtente = scanner1.nextInt();


                    if (sceltaUtente == 1) {
                        NumeroIntero numeroIntero = new NumeroIntero();
                        numeroIntero.start();
                    } else if (sceltaUtente == 2) {
                        SommaNum sommaNum = new SommaNum();
                        sommaNum.start();
                    }else if (sceltaUtente == 3) {
                        IndovinaNumero indovinaNumero= new IndovinaNumero();
                        indovinaNumero.start();
                    }
                }catch (Exception e){
                    condition= true;
                    System.out.println("ERRORE durante l'inserimento!");
                    System.out.println("INSRISCI UN NUMERO");
                }
            }while (cnd);
        }while (condition);
    }
}