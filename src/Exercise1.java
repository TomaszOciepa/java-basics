import java.text.DecimalFormat;
import java.util.Scanner;


// 1. Napisz program, który wczytuje ze standardowego wejścia trzy liczby całkowite i wypisuje na standardowym wyjściu ich średnią arytmetyczną.
public class Exercise1 {

    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Podaj liczbe 1:");
        double firstNumber = in.nextInt();
        System.out.println("Podaj liczbe 2:");
        double secondNumber = in.nextInt();
        System.out.println("Podaj 3 liczbe:");
        int thirdNumber = in.nextInt();

        System.out.println("Liczby to:" + firstNumber+ ","+secondNumber+","+thirdNumber);
        double sum = firstNumber + secondNumber + thirdNumber;
        double result = sum / 3;

        System.out.println("Średnia arytmetyczna liczb to: " + df2.format(result));
    }
}
