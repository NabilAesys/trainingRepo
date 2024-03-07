
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        System.out.println("--------STRING SCANNER INPUT-------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        String numeri = scanner.nextLine();  //
        SommaNum sommaNum = new SommaNum(numeri);
        int somma = sommaNum.sommaCifre();



        System.out.println("--------INTEGER SCANNER INPUT-------");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        Integer inputUtente1 = scanner1.nextInt();
        NumeroIntero numeroIntero = new NumeroIntero(inputUtente1);
        int i = numeroIntero.sommaCifreNumeroIntero();


        System.out.println();
        System.out.println("la somma delle cifre presenti nel numero intero è: " + i);
        System.out.println("la somma delle cifre presenti nella stringa è: " + somma);



    }

}