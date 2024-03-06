

public class NumeroIntero {

    private int num;
    int somma = 0;

    public NumeroIntero(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "NumeroIntero{" +
                "num=" + num +
                ", somma=" + somma +
                '}';
    }

    public  int sommaCifreNumeroIntero() {

        // Finché il numero non diventa 0, prendo l'ultima cifra, la sommo alla somma totale e divido il numero per 10
        while (num != 0) {
            somma += num % 10;
            num /= 10;
        }
        return somma;
    }

}

