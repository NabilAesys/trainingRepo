import java.util.ArrayList;
import java.util.List;

public class ConvertitoreInteroInArrayChar {

    public static void main(String[] args) {
        int result = 0;
        int numero = 12345;
        // Converto l'intero in una stringa
        String numeroStringa = Integer.toString(numero);
        // Converto la stringa in un array di caratteri
        char[] arrayCaratteri = numeroStringa.toCharArray();
        //Convero i caratteri in un  intero
        int number = Integer.parseInt(new String(arrayCaratteri));


        // Stampo l'array di caratteri
        System.out.println("Array di caratteri:");
        for (char c : arrayCaratteri) {
            System.out.print(c + " ");
        }

        // Stampo la somma dei numeri
        System.out.println(number);







    }
}

