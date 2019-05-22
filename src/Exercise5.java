// 5. Napisz program, który wczytuje ze standardowego wejścia nieujemną liczbę całkowitą n i wypisuje na
// standardowym wyjściu sumę kwadratów liczb od 0 do n, czyli wartość 0^2 + 1^2 + 3^2 + ... + n^2.

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {

        Scanner  in = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int number = in.nextInt();
        int result = 0;

        for (int i = 0; i <= number ; i++) {

           result +=  i * 2;

        }

        System.out.println("Suma kwadratów " + number+ " wynosi: "+ result);
    }
}
