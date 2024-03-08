import java.util.Random;
import java.util.Scanner;

public class IndovinaNumero {

    Random random = new Random();
    final int number = random.nextInt(10);
    boolean condition = true;
    public void start(){
        do {

            try {
                System.out.println("------------------------------");
                System.out.println("--------INDOVINA NUMERO-------");
                System.out.println("------------------------------");
                System.out.println("NUMERO GENERATO");
                System.out.println("FAI IL TUO GIOCO!");
                System.out.println("INDOVINA IL NUMERO");
                Scanner scanner = new Scanner(System.in);
                int tentativo = scanner.nextInt();
                if (tentativo == number) {
                    System.out.println(":) :)");
                    System.out.println("Complimenti sei un artista!");
                    condition = false;
                } else {
                    System.out.println(" :(  :(");
                    System.out.println("non ci siamo ");
                    if (tentativo < number) {
                        System.out.println("prova con  un numero piu grande");
                    } else {
                        System.out.println("prova con un numero piu piccolo");
                    }
                }
            } catch (Exception e) {
                System.out.println("errore durante l'inserimento!!");
                System.out.println("inserisci un carattere numerico");
            }
        }while (condition);
    }
}
