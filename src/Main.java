

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Inserisci il numero che equivale alla tua scelta");
                Integer sceltaUtente = scanner1.nextInt();


                if (sceltaUtente == 1) {
                    SommaNum sommaNum = new SommaNum();
                    sommaNum.start();
                } else if (sceltaUtente == 2) {
                    NumeroIntero numeroIntero = new NumeroIntero();
                    numeroIntero.start();
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